package com.studentdemo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentdemo.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

	Optional<Student> findById(Long id);

	boolean existsById(Long id);

	void deleteById(Long id);
    
}
