package com.jdbc.withspring;

public class EmployeeDAO {
	
	private org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.JdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e)
	{
		String query = "insert into employee values"('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jdbcTemplate.update(query);
	}
}
