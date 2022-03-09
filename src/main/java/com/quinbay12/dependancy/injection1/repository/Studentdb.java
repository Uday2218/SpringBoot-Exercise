package com.quinbay12.dependancy.injection1.repository;

import com.quinbay12.dependancy.injection1.dto.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Component
public class Studentdb {
    List<Student> list = new ArrayList();

    public List<Student> getstudentlist() {
        if (list.size() == 0) {

            Student S1 = new Student(1L, "df", "fbfb", "IT");
            Student S2 = new Student(2L, "djh", "dgd", "ECE");
            Student S3 = new Student(3L, "fjd", "dbjdh", "CSE");
            list.add(S1);
            list.add(S2);
            list.add(S3);

        }
        return (list);
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public void deleteStudent(Long id) {

        for (Student st : list) {
            if (st.getId() == id) {
                list.remove(st);
                break;
            }
        }
    }

    public Student updateStudent(Student student) {
        for (Student st : list) {
            if (st.getId() == student.getId()) {
                st.setFirstname(student.getFirstname());
                st.setLastname(student.getLastname());
                st.setBranch(student.getBranch());

                return new Student(st.getId(), st.getFirstname(), st.getLastname(), st.getBranch());
            }
        }
        return null;


    }
}





