package com.studentdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.studentdemo.Entity.Student;
import com.studentdemo.Service.StudentService;


import java.util.List;
import java.util.*;
import java.util.Optional;

@Controller

public class StudentController {
//    @Autowired
//    private  StudentService studentService;   
//
//    @GetMapping("/students")
//    public List<Student> getAllStudents() {
//        return studentService.getAllStudents();
//    }
//    
//    @RequestMapping("/students")
//    public String getAllStudents(Model model) {
//    	System.out.println("hello");
//        List<Student> datalist = studentService.getAllStudents();
//        model.addAttribute("datalist", datalist);
//        System.out.println("hello1"+datalist.size());
//        return "student/show"; // This returns the view name "show.html" for rendering.
//    }
//
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
//        Optional<Student> student = studentService.getStudentById(id);
//        return student.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @PostMapping("/insert")
//    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
//        Student createdStudent = studentService.createStudent(student);
//        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
//        Student updatedStudent = studentService.updateStudent(id, student);
//        return updatedStudent != null ?
//                new ResponseEntity<>(updatedStudent, HttpStatus.OK) :
//                new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
//        boolean deleted = studentService.deleteStudent(id);
//        return deleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
}
