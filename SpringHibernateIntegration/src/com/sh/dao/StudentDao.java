package com.sh.dao;

import java.util.List;

import com.sh.beans.Student;

public interface StudentDao {
	
	public int insert(Student s);
	public void delete(int id);
	public void delete(Student s);
	public void update(Student s);
	public Student getStudent(int id);
	public List<Student> getAllStudents();

}
