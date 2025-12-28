package com.example.learnings.controller;


//import com.example.learnings.entity.Student;
//import com.example.learnings.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


//    @Autowired
//    private StudentService studentService;
//
//    @PostMapping("/save")
//    public boolean saveStudent(@RequestBody Student student){
//        return studentService.saveStudent(student);
//    }
//    @GetMapping("/get")
//    public List<Student> getAllStudents(){
//        return studentService.getAllStudents();
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public boolean deleteStudent(@PathVariable int id){
//        return studentService.deleteStudent(id);
//    }
//
//    @GetMapping("/get/{id}")
//    public Student getStudent(@PathVariable int id){
//        return studentService.getStudent(id);
//    }
//
//    @PutMapping("/update")
//    public boolean updateStudent(@RequestBody Student student){
//        return studentService.updateStudent(student);
//    }
//
//    @GetMapping("/getByEmail/{email}")
//    public Student getStudentByEmail(@PathVariable String email){
//        return studentService.getStudentByEmail(email);
//    }

    @GetMapping("/get/{name}")
    public String getAllStudents(@PathVariable String name){
        return "Hello "+name;
    }

}
