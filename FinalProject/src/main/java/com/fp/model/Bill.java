/*package com.fp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Bill")
public class Bill {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer billId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastname;
	
	@Column(name = "Contact")
	private String mobileNumber;
	
	@Column(name = "EmailId")
	private String email;
	
	@OneToMany(cascade =  CascadeType.ALL)
	private CustomerAddress address;
	
	@OneToMany(cascade =  CascadeType.ALL)
	private Items item;
	
	/*@Column(name = "TotalItem")
	private Integer totalItem;
	
	@Column(name = "TotalCost")
	private Double totalCost;*/
	
	


