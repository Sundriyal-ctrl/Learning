//package com.example.learnings.service;
//
//import com.example.learnings.entity.Student;
//import com.example.learnings.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    public boolean saveStudent(Student student){
//        studentRepository.save(student);
//        return true;
//    }
//
//    public List<Student> getAllStudents(){
//        return studentRepository.findAll();
//    }
//
//    public boolean deleteStudent(int id){
//        studentRepository.deleteById(id);
//        return true;
//    }
//
//    public Student getStudent(int id){
//        return studentRepository.findById(id).get();
//    }
//
//    public boolean updateStudent(Student student){
//        Optional<Student> student1 = studentRepository.findById(student.getId());
//        if(student1.isPresent()){
//            studentRepository.save(student);
//        }else{
//            return false;
//        }
//        return true;
//    }
//
//    public Student getStudentByEmail(String email){
//        return studentRepository.findByEmail(email).get();
//    }
//}
//
//
//
//
