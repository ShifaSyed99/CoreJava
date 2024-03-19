package com.jdbc.withspring;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e){
		String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jdbcTemplate.update(query);
	}
	public List<Employee>employee()
	{
		String sql="select * from employee";
		List<Employee>employees=jdbcTemplate.query(sql,new EmployeeMapper());
		return employees;
	}
	
	public void updateEmployee(Employee e) {
		String query = "update employee set name = ?, salary = ?where id = ? ";
		jdbcTemplate.update(query, e.getName(), e.getSalary(), e.getId());
		System.out.println("Updated Successfully ");
	}
	
	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id = '"+e.getId()+"'";
		return jdbcTemplate.update(query);
	}
	
}	