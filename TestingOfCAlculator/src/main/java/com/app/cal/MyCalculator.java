package com.app.cal;

import ClaculatorClasses.*;

public class MyCalculator extends CalculatorOption {
	static double memory = 0;

	@Override
	public double calculate(double valueA, double valueB) {

		memory = valueA + valueA;

		return memory;
	}

}
