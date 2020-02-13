package com.pe.l1.java8.DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class DateTimeExample {

	public static void main(String[] args) {
	//IDIOM:Item-0140: Use the new Java 8+ time API (JSR-310)
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Example using LocalDateTime");
		System.out.println("YYYY-MM-DD and HH:MM:SS--"+localDateTime.toString());     
		System.out.println("Day of the Month:"+localDateTime.getDayOfMonth());
		System.out.println("HH:"+localDateTime.getHour());       
		System.out.println("Nano Secs:"+localDateTime.getNano()+"\n");
		
		//IDIOM:Item-0141: Prefer Duration over numeric time unit
		System.out.println("Example using Duration:");
	
		// Creating Durations
        Duration oneHours = Duration.ofHours(1);
        System.out.println(oneHours.getSeconds() + " seconds");

        Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(oneHours2.getSeconds() + " seconds");

		// Test Duration.between
        System.out.println("\n--- Duration.between --- ");

        LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 20, 55);
        LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);

        System.out.println(oldDate);
        System.out.println(newDate);

        //count seconds between dates
        Duration duration = Duration.between(oldDate, newDate);

        System.out.println(duration.getSeconds() + " seconds");
	}

}
