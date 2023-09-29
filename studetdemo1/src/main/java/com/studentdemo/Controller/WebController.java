package com.studentdemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentdemo.Entity.Student;
import com.studentdemo.Service.StudentService;

@Controller

public class WebController {
	@Autowired
    private  StudentService studentService;

	@GetMapping(value = "/")
	 public String getHomePage(Model model) {
   	   System.out.println("Home page reques received...");
       return "index";
	}

	@GetMapping(value = "/students")
	 public String getAllStudents(Model model) {
    	System.out.println("hello");
        List<Student> datalist = studentService.getAllStudents();
        model.addAttribute("datalist", datalist);
        System.out.println("hello1"+datalist.size());
        return "show.html";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		System.out.println("hi");
		return "edit_student";
	}
	

	@GetMapping("/students/edit")
	public String editStudentForm1(@ModelAttribute("id") Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		System.out.println("hiI");
		return "edit_student";
	}
	
	
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setName(student.getName());
		existingStudent.setAddress(student.getAddress());
		
		// save updated student object
		Student student1 = studentService.updateStudent(existingStudent);
		return "redirect:/students";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
	Boolean delete=	studentService.deleteStudent(id);
		return "redirect:/students";
	}	
	
	

}
