package com.practice.problem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class ConvertTime {

	public static void main(String[] args) {
		String timeStr = "19:45";
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime localTime = LocalTime.parse(timeStr, inputFormatter);
        
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("h:mm a");
        String istTimeStr = localTime.format(outputFormatter);
        System.out.println("IST time: " + istTimeStr);

	}

}
