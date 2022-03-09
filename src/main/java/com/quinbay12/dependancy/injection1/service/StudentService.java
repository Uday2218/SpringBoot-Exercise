package com.quinbay12.dependancy.injection1.service;

import com.quinbay12.dependancy.injection1.dto.Student;
import com.quinbay12.dependancy.injection1.entity.MongoStudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {
    List<Student> getAllStudents();
//    Student getStudent(int id);
     void addStudent(Student student,Integer number);
    void updateStudent(Student student,Integer number);
    void deleteStudent(Long id,Integer number);

}
