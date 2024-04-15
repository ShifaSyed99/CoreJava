package com.fp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fp.model.Items;
import com.fp.service.ItemsService;

@RestController
@RequestMapping("/app")
public class ItemsController {

	@Autowired
	private ItemsService serv;
	
	
	@PostMapping("/add")
	public Items addItem(@RequestBody Items item){
				
		return serv.addItem(item);
	}
	
	@PutMapping("/update/{id}")
	public Items updateItem(@PathVariable("id") int id, @RequestBody Items item){
		
		item.setItemId(id);
		return serv.updateItem(item);
		
	}
	
	@GetMapping("/view/{id}")
	public Items viewItemsById(@PathVariable("id") int itemId){
				
		return serv.viewItemsById(itemId);
		
	}
	
	@GetMapping("/view/{name}")
	public Items viewItemsByName(@PathVariable("id") String name){
				
		return serv.viewItemsByName(name);
		
	}
	
	@GetMapping("/readAll")
	public List<Items> viewAllItems(String name) {
		
		return serv.viewAllItems();
	}
	
	@DeleteMapping("/remove/{id}")
	public String removeItem(@PathVariable("id") int itemId){
		
		return serv.removeItem(itemId);
	}

}
