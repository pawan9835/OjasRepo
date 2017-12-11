package com.app.apple;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.app.cal.MyCalculator;
import com.app.cal.CalculatorOption;

public class TestMyCalculator {
  
	
	CalculatorOption c = null;
	int valueA, valueB;
	double exp;

	@Before
	public void preSetup() {

		c = new MyCalculator();
		valueA = 10;
		valueB = 5;
		exp = 0;
	}

	
	@Test
	public void test() {
		double actual = c.calculateOptions("%").calculate(valueA, valueB);

		// assertEquals(exp, actual);
		assertEquals(exp, actual, 0.0);
	}

}
