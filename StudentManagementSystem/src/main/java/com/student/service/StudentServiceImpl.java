package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.StudentResource;
import com.student.repository.StudentRepository;

//handles business logic and calls method from repository
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired	
	StudentRepository repo;
	
	@Override
	public Student createStudent(Student s) {
		
		return repo.save(s);
	}

	@Override
	public Student updateStudent(Student s) {
		
		Optional<Student> stud = repo.findById(s.getStudId());
		if(stud.isPresent()) 
		{
			Student updatestudent = stud.get();
			updatestudent.setStudId(s.getStudId());
			updatestudent.setFirstName(s.getFirstName());
			updatestudent.setLastName(s.getLastName());
			updatestudent.setAge(s.getAge());
			return updatestudent;
		}
		else
		{
			throw new StudentResource("ID is not available!!");
		}
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		
		Optional<Student> stud = repo.findById(id);
		if(stud.isPresent()) 
		{
			return stud.get();
		}
		else
		{
			throw new StudentResource("ID is not available!!");
		}
		
	}

	@Override
	public String deleteStudent(int id) {
		
		Optional<Student> stud = repo.findById(id);
		if(stud.isPresent()) 
		{
			repo.delete(stud.get());
	    }
		else
		{
			throw new StudentResource("ID is not available!!");
		}
		return "ID is deleted";	
	}
	
	
}	
