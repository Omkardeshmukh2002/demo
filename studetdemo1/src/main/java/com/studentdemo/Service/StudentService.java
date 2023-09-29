package com.studentdemo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdemo.Entity.Student;
import com.studentdemo.Repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService   {

	@Autowired
    private  StudentRepository studentRepository;
    
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent( Student updatedStudent) {
        if (studentRepository.existsById(updatedStudent.getId())) {
            updatedStudent.setId(updatedStudent.getId());
            updatedStudent.setName(updatedStudent.getName());
            updatedStudent.setAddress(updatedStudent.getAddress());
            return studentRepository.save(updatedStudent);
        }
        return null; // Student with the given ID not found
    }

    public boolean deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.delete(studentRepository.findById(id).get());
            return true;
        }
        return false; // Student with the given ID not found
    }
}
