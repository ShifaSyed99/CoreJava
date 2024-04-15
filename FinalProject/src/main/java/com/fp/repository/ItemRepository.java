package com.fp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fp.model.Items;

@Repository
public interface ItemRepository extends JpaRepository<Items, Integer> {

	public Optional<Items> findByItemName(String itemName);
	

}
