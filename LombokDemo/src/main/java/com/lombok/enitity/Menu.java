package com.lombok.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

	private int menuId;
	
	private String menuName; 
	
	private int price;
	
	private int qty;
}
