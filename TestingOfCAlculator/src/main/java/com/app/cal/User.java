package com.app.cal;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Double first, second;

		System.out.println("Enter First Number");
		first = s.nextDouble();
		System.out.println("Press +   -   /   *   %   ");
		String oprator = s.next();
		System.out.println("Enter Second Number");
		second = s.nextDouble();
		
		CalculatorOption cal = new MyCalculator();

		double result = cal.calculateOptions(oprator).calculate(first, second);

		System.out.println(result);

	}

}
