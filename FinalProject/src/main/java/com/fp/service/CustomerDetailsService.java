package com.fp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fp.exception.CustomerDetailsNotFoundException;
import com.fp.model.CustomerDetails;

@Service
public interface CustomerDetailsService {
	
	public CustomerDetails addCustomer(CustomerDetails customer);
	
	public CustomerDetails updateCustomer(CustomerDetails customer) throws CustomerDetailsNotFoundException;
	
	public String removeCustomer(int customerId) throws CustomerDetailsNotFoundException;
	
	public CustomerDetails viewCustomer(int customerId);

    public List<CustomerDetails>  viewAllCustomer() throws CustomerDetailsNotFoundException;
    

}
