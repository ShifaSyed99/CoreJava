package com.fp.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.fp.model.CustomerDetails;

@Repository
public interface CustomerRepository extends JpaRepositoryImplementation<CustomerDetails, Integer>{

	public CustomerDetails findByEmail(String email);

	public CustomerDetails findByMobileNumber(String mobileNo);
	

}
