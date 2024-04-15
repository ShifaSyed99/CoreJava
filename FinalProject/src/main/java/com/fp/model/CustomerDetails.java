package com.fp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

		@Entity
		@Data
		@NoArgsConstructor
		@AllArgsConstructor
		@Table(name = "CustomerDetails")
		public class CustomerDetails {
			
			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private int customerId;
			
			@Column(name = "FirstName")
			private String firstName;
			
			@Column(name = "LastName")
			private String lastname;
			
			@Column(name = "Age")
			private int age;
			
			@Column(name = "Gender")
			private String gender;
			
			@Column(name = "Contact")
			private String mobileNumber;
			
			@Column(name = "EmailId")
			private String email;
			
			@OneToOne(cascade = CascadeType.ALL)
			private CustomerAddress address;
			
			@Column(name = "Password")
			private String password;

	


}
