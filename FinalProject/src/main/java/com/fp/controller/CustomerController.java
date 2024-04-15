package com.fp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fp.exception.CustomerDetailsNotFoundException;
import com.fp.model.CustomerDetails;
import com.fp.service.CustomerDetailsService;

import jakarta.validation.Valid;

@RestController("/capp")
	public class CustomerController {
	 
		@Autowired
		private CustomerDetailsService cserv;
		
		@PostMapping("/cadd")
		public CustomerDetails addCustomer(@Valid @RequestBody CustomerDetails customer){
		
			return cserv.addCustomer(customer);
		}
		
		@PutMapping("/cupdate/{id}")
		public CustomerDetails updateCustomer(@Valid @RequestBody CustomerDetails customer, int customerId) throws CustomerDetailsNotFoundException{
		
			customer.setCustomerId(customerId);
			return cserv.updateCustomer(customer);
		}
		
		@DeleteMapping("/cremove/{id}")
		public String removeCustomer(@PathVariable("id") Integer customerId) throws CustomerDetailsNotFoundException{
			
			return cserv.removeCustomer(customerId);
		}
		
		@GetMapping("/viewCustomer")
		public List<CustomerDetails> viewCustomer(@PathVariable("id") Integer customerId) throws CustomerDetailsNotFoundException{
		
			return cserv.viewAllCustomer();
		}
		
		@GetMapping("/viewAllCustomer/{id}")
		public CustomerDetails viewCustomer(@PathVariable("id") int customerId) throws CustomerDetailsNotFoundException{
			
			return cserv.viewCustomer(customerId);
		}

}
