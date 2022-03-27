package com.bl.monthlypayment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MonthlyPaymentCalculatorTest {
	

@Test
public void test() {
		assertEquals(88, MonthlyPaymentCalculator.monthlyPayment(1000,1, 12));
}

	

	
}
