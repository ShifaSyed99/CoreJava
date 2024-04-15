package com.fp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fp.model.Cart;
import com.fp.model.CustomerDetails;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	public Cart findByCustomer(CustomerDetails customer);
	
}
