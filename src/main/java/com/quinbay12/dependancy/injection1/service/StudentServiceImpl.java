package com.quinbay12.dependancy.injection1.service;

import com.quinbay12.dependancy.injection1.dto.Student;
import com.quinbay12.dependancy.injection1.entity.MongoStudentEntity;
import com.quinbay12.dependancy.injection1.entity.StudentEntity;
import com.quinbay12.dependancy.injection1.repository.StudentMongoDbRepository;
import com.quinbay12.dependancy.injection1.repository.StudentRedisRepository;
import com.quinbay12.dependancy.injection1.repository.StudentRepository;
import com.quinbay12.dependancy.injection1.repository.Studentdb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    Studentdb studentdb;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentRedisRepository studentRedisRepository;
    @Autowired
    StudentMongoDbRepository studentMongoDbRepository;

    @Override
    public List<Student> getAllStudents() {


        List<Student> list = new ArrayList<>();
        for (StudentEntity studentEntity : studentRepository.findAll()) {
            Student student = new Student();
            student.setId(studentEntity.getId());
            student.setFirstname(studentEntity.getFirstname());
            student.setLastname(studentEntity.getLastname());
            student.setBranch(studentEntity.getBranch());
            list.add(student);
        }

        for (MongoStudentEntity mongoStudentEntity : studentMongoDbRepository.findAll()) {
            Student student1 = new Student();
            student1.setId(mongoStudentEntity.getId());
            student1.setFirstname(mongoStudentEntity.getFirstname());
            student1.setLastname(mongoStudentEntity.getLastname());
            student1.setBranch(mongoStudentEntity.getBranch());
            list.add(student1);
        }

        list.addAll(studentRedisRepository.findAll());
        list.addAll(studentdb.getstudentlist());

        return list;
    }


//    @Override
//    public Student getStudent(int id) {
////        for (Student student : studentdb.getstudentlist()) {
////            if (student.getId() == id)
////                return(student);
////        }
//
//        return null;
//    }


       @Override
        public void addStudent (Student student,Integer number){
            if(number==1)

            {
                studentRepository.save(new StudentEntity(student.getId(),student.getFirstname(),student.getBranch(),student.getLastname()));
            }


            if(number==2)
            {
                studentdb.addStudent(student);

            }

             if(number==3)
                studentRedisRepository.insert(student);
              if(number==4) {
                studentMongoDbRepository.save(new MongoStudentEntity(student.getId(),student.getFirstname(),student.getLastname(),student.getBranch()) );

                }

            }

         // studentRedisRepository.insert(student);
//              studentMongoDbRepository.save(student);




    @Override
    public void updateStudent(Student student,Integer number) {
        if (number == 1) {

            for (StudentEntity studentEntity : studentRepository.findAll()) {
                if (studentEntity.getId() == student.getId()) {
                    studentRepository.save(new StudentEntity(student.getId(), student.getFirstname(),
                            student.getLastname(), student.getBranch()));

                }

            }
            if (number == 2) {

                studentdb.updateStudent(student);


                if (number == 3)

                    studentRedisRepository.save(student);
                if (number == 4) {

                    studentMongoDbRepository.save(new MongoStudentEntity(student.getId(), student.getFirstname(),
                            student.getLastname(), student.getBranch()));
                }
            }
        }
    }

//
//

        @Override
        public void deleteStudent (Long id,Integer number){
        if(number==1)
        {

               studentRepository.deleteById(id);
        }
        if(number==2)
        {
            studentdb.deleteStudent(id);
        }
        if(number==3)

        {

            studentRedisRepository.deleteOne(id);
        }
        if(number==4)
            for(MongoStudentEntity student:studentMongoDbRepository.findAll())
            {
                if(student.getId() ==id )
                {
                 studentMongoDbRepository.delete(student);
                }

            }


        }


}


