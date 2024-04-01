package com.eb.OneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eb.OneToOneMapping.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
