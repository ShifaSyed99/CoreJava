package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/app")
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/addstud")
	public Student createStudent(@RequestBody Student s)   {
		return service.createStudent(s);
	}
	
	
	@PutMapping("/updatestud/{id}")
	public Student  updateStudent(@PathVariable("id") int id, @RequestBody Student s) {
		s.setStudId(id);
		return service.updateStudent(s);
	}
	
	@GetMapping("/readAll")
	public List<Student> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@DeleteMapping("/remove/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return service.deleteStudent(id);
		
	}
	
	@GetMapping("/read/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return service.getStudentById(id);
		
	}
}
