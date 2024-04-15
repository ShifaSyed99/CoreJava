package com.fp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fp.exception.ItemNotFoundException;
import com.fp.model.Items;
import com.fp.repository.ItemRepository;

public class ItemsServiceImpl implements ItemsService {
	
	@Autowired
	private ItemRepository repo;
	

	@Override
	public Items addItem(Items item) throws ItemNotFoundException {
	
		return repo.save(item);
	}

	@Override
	public Items updateItem(Items item) throws ItemNotFoundException {
		Optional<Items> items = repo.findById(item.getItemId());

		if(items.isPresent()) 
		{
			Items updateItem = items.get();
			updateItem.setItemId(item.getItemId());
			updateItem.setItemName(item.getItemName());
			updateItem.setCost(item.getCost());
			updateItem.setQuantity(item.getQuantity());
	
			return updateItem;
			
		}
		else {
			throw new ItemNotFoundException("There is no such item to be updated........Please add it first");
		}
	}

	@Override
	public Items viewItemsById(int itemId) {
		Optional<Items> items = repo.findById(itemId);
		
		if(items.isPresent()) {
			
			return items.get();
			
		}
		else {
			throw new ItemNotFoundException("No such Item in List....");
		}
		
	}

	@Override
	public Items viewItemsByName(String name)  {

		Optional<Items> items = repo.findByItemName(name);
		if(items.isPresent()) 
		{
			return items.get();
		}
			
		else
			{
			throw new ItemNotFoundException("Item with this name not exist.....");
			}
		
		}
	
	@Override
	public List<Items> viewAllItems() {

			return repo.findAll();
	}
	

	@Override
	public String removeItem(int itemId) throws ItemNotFoundException {
		
		Optional<Items> item = repo.findById(itemId);
		
		if(item.isPresent()) {
			
			repo.delete(item.get());
		}
		else {
			throw new ItemNotFoundException("No Such Item to be Removed...... Please add it First");
		}
		return "ID is deleted";
	}

	

}
