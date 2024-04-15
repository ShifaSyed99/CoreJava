package com.fp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fp.model.Cart;
import com.fp.model.Items;
import com.fp.service.CartService;

import jakarta.validation.Valid;

@Service
@RestController("/cart")
public class CartController {
	
	@Autowired
	private CartService cartserv;
	
	
	@PostMapping("/cartadd")
	public Cart addItemToCart(@RequestBody Cart cart, @RequestBody Items item){
		
		return cartserv.addItemToCart(cart, item);
	}
	
	
	@PutMapping("/increaseqt/{quantity}")
	public Cart increaseQuantityOfItem(@Valid @RequestBody Cart cart,@Valid @RequestBody Items item,@PathVariable("quantity") int quantity){
		
		return cartserv.increaseQuantityOfItem(cart, item, quantity);
	}
	
	
	
	@PutMapping("/reduceqt/{quantity}")
	public Cart reduceQuantityOfItemHandler(@Valid @RequestBody Cart cart,@Valid @RequestBody Items item,@PathVariable("quantity") int quantity){
		
		return cartserv.reduceQuantityOfItem(cart, item, quantity);
		
		
	}
	
	
	
	@DeleteMapping("/removeItem")
	public Cart removeItemFromCartHandler(@Valid @RequestBody Cart cart,@Valid @RequestBody Items item){
		
		return cartserv.removeItemFromCart(cart, item);
	}




	@PutMapping("/clearCart")
	public Cart cleartCartHandler(@Valid @RequestBody Cart cart, Items item){
		
		return cartserv.clearCart(cart, item);
	}


}
