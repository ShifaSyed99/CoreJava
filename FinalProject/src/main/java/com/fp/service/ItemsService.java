package com.fp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fp.exception.ItemNotFoundException;
import com.fp.model.Items;

@Service
public interface ItemsService {
	
	public Items addItem(Items item) ;//throws ItemNotFoundException;
	
	public Items updateItem(Items item) ;//throws ItemNotFoundException;
	
	public List<Items> viewAllItems() ;//throws ItemNotFoundException;
	
	public String removeItem(int itemId) ;//throws ItemNotFoundException;
	
	public Items viewItemsById(int itemId);
			
	public Items viewItemsByName(String name) ;//throws ItemNotFoundException;
 	

}
