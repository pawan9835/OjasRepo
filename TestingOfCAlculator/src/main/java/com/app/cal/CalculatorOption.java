package com.app.cal;

import ClaculatorClasses.Addition;
import ClaculatorClasses.Division;
import ClaculatorClasses.Modules;
import ClaculatorClasses.Substraction;

public abstract class CalculatorOption implements ICalclator {

	public abstract double calculate(double valueA, double valueB);

	public ICalclator calculateOptions(String option) {

		if (option.equals("+")) {
			return new Addition();
		}

		else if (option.equals("-")) {
			return new Substraction();

		} else if (option.equals("*")) {
			return new Substraction();

		} else if (option.equals("/")) {
			return new Division();

		} else if (option.equals("%")) {
			return new Modules();
		}

		return null;

	}

}
