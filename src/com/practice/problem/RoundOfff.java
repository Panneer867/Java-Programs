package com.practice.problem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundOfff {

	public static void main(String[] args) {

		double number = 125.460000000000000000001;
		BigDecimal bd = new BigDecimal(number);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		double roundedNumber = bd.doubleValue();
		System.out.println(roundedNumber);
	}

}
