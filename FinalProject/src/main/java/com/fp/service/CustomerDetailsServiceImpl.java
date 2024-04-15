package com.fp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fp.exception.CustomerDetailsNotFoundException;
import com.fp.exception.ItemNotFoundException;
import com.fp.model.CustomerDetails;
import com.fp.model.Items;
import com.fp.repository.CustomerRepository;

public class CustomerDetailsServiceImpl implements CustomerDetailsService {
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public CustomerDetails addCustomer(CustomerDetails customer) {

		return repo.save(customer);
	}

	@Override
	public CustomerDetails updateCustomer(CustomerDetails customer) throws CustomerDetailsNotFoundException {
		
		Optional<CustomerDetails> cust = repo.findById(customer.getCustomerId());

		if(cust.isPresent()) 
		{
			CustomerDetails updateCustomer = cust.get();
			updateCustomer.setCustomerId(customer.getCustomerId());
			updateCustomer.setFirstName(customer.getFirstName());
			updateCustomer.setLastname(customer.getLastname());
			updateCustomer.setEmail(customer.getEmail());
			updateCustomer.setAddress(customer.getAddress());
			updateCustomer.setMobileNumber(customer.getMobileNumber());
	
			return updateCustomer;
			
		}
		else {
			throw new CustomerDetailsNotFoundException("There is no such customer to be updated........Please add it first");
		}

		
	}


	@Override
	public List<CustomerDetails> viewAllCustomer() {
		
		return repo.findAll();
	}
	
	@Override
	public CustomerDetails viewCustomer(int customerId) {

		Optional<CustomerDetails> cust = repo.findById(customerId);
		
		if(cust.isPresent()) {
			
			return cust.get();
			
		}
		else {
			throw new ItemNotFoundException("No such Customer in List....");
		}
	}

	@Override
	public String removeCustomer(int customerId) throws CustomerDetailsNotFoundException {

		Optional<CustomerDetails> cust = repo.findById(customerId);
		
		if(cust.isPresent()) {
			
			repo.delete(cust.get());
		}
		else {
			throw new CustomerDetailsNotFoundException("No Such Customer to be Removed...... Please add it First");
		}
		return "Customer is deleted";
	}

	

}
