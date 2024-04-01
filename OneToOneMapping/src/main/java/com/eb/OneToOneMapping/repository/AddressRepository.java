package com.eb.OneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eb.OneToOneMapping.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
	Address findByZipCode(String id);

}
