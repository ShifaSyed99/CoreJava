package com.fp.service;

import org.springframework.stereotype.Service;

import com.fp.exception.CartException;
import com.fp.model.Cart;
import com.fp.model.Items;

@Service
public interface CartService {

	public Cart addItemToCart(Cart cart, Items item) throws CartException;

	public Cart increaseQuantityOfItem(Cart cart, Items item, int quantity) throws CartException;
	
	public Cart reduceQuantityOfItem(Cart cart, Items item, int quantity) throws CartException;
	
	public Cart removeItemFromCart(Cart cart, Items item) throws CartException;
	
	public Cart clearCart(Cart cart, Items item) throws CartException;
	
}
