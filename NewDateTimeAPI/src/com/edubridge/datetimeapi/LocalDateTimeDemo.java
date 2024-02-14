package com.edubridge.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println("The current date is: "+d);
		
		LocalTime t = LocalTime.now();
		System.out.println("The current time is: "+t);
		
		LocalDateTime l = LocalDateTime.now();
		System.out.println("The current date and time is: "+l);

	}

}
