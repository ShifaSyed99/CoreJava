package com.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table(name = "Student_INFO")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studId;
	
	@Column(name = "FirsttName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Age")
	private int age;

}
