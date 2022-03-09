package com.quinbay12.dependancy.injection1.Controller;


import com.quinbay12.dependancy.injection1.dto.Student;
import com.quinbay12.dependancy.injection1.entity.MongoStudentEntity;
import com.quinbay12.dependancy.injection1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
//@RequestMapping("student")
public class  StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping("/student")
    public List<Student> getAllStudents() {
        //return null;
       return studentService.getAllStudents();
    }

    //    @GetMapping("/student/{id}")
//        public Student getStudent (@PathVariable Integer id)
//        {
//            return (studentService.getStudent(1));
//
//        }
//    @GetMapping("/student")
//    public Student getStudent(@RequestParam(required = true) int id)
////                             @RequestParam (required = false) String firstname)
//    {
//        return (studentService.getStudent(id));


    @PostMapping(value="/student")
    public void addStudent(@RequestBody  @Valid Student student,@RequestParam Integer number) {
        studentService.addStudent(student,number);
    }


//
//    @DeleteMapping("/student")
//    public void updateStudent(@RequestBody Student student)
//    {
//         studentService.updateStudent(student);
//    }
////
//    @GetMapping("/student")
//    public List<Student> getAllStudents() {
//        return studentService.getAllStudents();
//    }
   @PutMapping("/student")
   public void updateStudent(@RequestBody Student student,@RequestParam Integer number){
    studentService.updateStudent(student,number);
}
    @DeleteMapping("/student")
    public void deleteStudent(@RequestParam Long id,@RequestParam Integer number){
        studentService.deleteStudent(id,number);
    }


    }

