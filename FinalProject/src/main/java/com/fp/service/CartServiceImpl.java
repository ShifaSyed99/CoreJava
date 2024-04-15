package com.fp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.fp.exception.CartException;
import com.fp.exception.ItemNotFoundException;
import com.fp.model.Cart;
import com.fp.model.Items;
import com.fp.repository.CartRepository;

public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartrepo;
	
	@Override
	public Cart addItemToCart(Cart cart, Items item) throws CartException {
	
		if(cart.getItems().contains(item))
		{
			cart.getItems().add(item);
		}
		else 
		{
			throw new ItemNotFoundException("Item is not available..");
		}
		return cartrepo.save(cart);
	}

	@Override
	public Cart increaseQuantityOfItem(Cart cart, Items item, int quantity) throws CartException {
		
		if(cart.getItems().contains(item))
		{
			for(Items list : cart.getItems())
			{
				if(list.equals(item))
				{
					list.setQuantity(list.getQuantity()+1);
				}
			}
		
		}
		return cartrepo.save(cart);
	}

	@Override
	public Cart reduceQuantityOfItem(Cart cart, Items item, int quantity) throws CartException {
	
		if(cart.getItems().contains(item))
		{
			for(Items list : cart.getItems())
			{
				if(list.equals(item))
				{
					if(list.getQuantity()<1)
					{
						throw new CartException("Not enough quantity..");
					}
					list.setQuantity(list.getQuantity() - 1);
				}
		}
			
	}
		return cartrepo.save(cart);
	}	

	@Override
	public Cart removeItemFromCart(Cart cart, Items item) throws CartException {
		if(cart.getItems().contains(item))
		{
			cart.getItems().remove(item);
			
		}
		else
		{
			throw new CartException("No such item in cart..");	
		}
		return cartrepo.save(cart);
	}

	@Override
	public Cart clearCart(Cart cart, Items item) throws CartException {
	
		if(cart.getItems().contains(item))
		{
			cart.getItems().clear();
		}
		return cartrepo.save(cart);
	}
	
	
	

}
