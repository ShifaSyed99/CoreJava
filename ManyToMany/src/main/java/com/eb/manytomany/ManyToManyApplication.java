package com.eb.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.eb.manytomany.model.Skills;
import com.eb.manytomany.model.Student;
import com.eb.manytomany.repository.SkillRepository;
import com.eb.manytomany.repository.StudentRepository;

@SpringBootApplication
public class ManyToManyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ManyToManyApplication.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		SkillRepository skillRepository = context.getBean(SkillRepository.class);

		Student student = new Student();
		student.setStudentName("Robert");
		student.setQualification("BE");
		student.setRollNo(5);
		
		Skills skills = new Skills();
		skills.setSkillName("Java");
		skills.setSkillsScore("90%");
		
		Skills skills2 = new Skills();
		skills2.setSkillName("Python");
		skills2.setSkillsScore("45%");
		
		student.getSkills().add(skills);
		student.getSkills().add(skills2);
		
		skills.getStudents().add(student);
		skills2.getStudents().add(student);
		
		studentRepository.save(student); //we have use CASCADE_ALL
	}

	}


