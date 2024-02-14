package com.edubridge.datetimeapi;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalZonedDateTimeDemo {

	private static final DateTimeFormatter DateTimeFormatter = null;

	public static void main(String[] args) {
		
		ZonedDateTime z = ZonedDateTime.now();
		System.out.println(z);
		System.out.println();
		
		OffsetTime t = OffsetTime.now();
		System.out.println(t);
		System.out.println();

		OffsetDateTime d = OffsetDateTime.now();
		System.out.println(d);
		System.out.println();
		
		ZoneId i = ZoneId.of("Asia/Calcutta");
		System.out.println(i);
		System.out.println();
		
		ZoneOffset o = ZoneOffset.of("Z");
		System.out.println(o);
		System.out.println();
		
		String s = "2024-02-13 12:30";
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l = LocalDateTime.parse(s, f);
		System.out.println(l);
		
		/*
		DateTimeFormatter f = DateTimeFormatter.ofPattern(s, null)
		LocalDateTime l = LocalDateTime.parse(s, f);
		System.out.println(l);
		yyyy-MM-dd HH:mm*/
	}

}
