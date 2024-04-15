package com.fp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Items")
public class Items {




		@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	
	@Column(name = "ItemName")
	private String itemName;
	
	@NotNull(message = "Please Enter quantity..")
	@Min(1)
	@Column(name = "Quantity")
	private int quantity;
	
	@Column(name = "Cost")
	private double cost;

	
	

}
