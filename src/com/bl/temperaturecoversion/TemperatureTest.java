package com.bl.temperaturecoversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TemperatureTest {
	
	
	@Test
	public void test() {
		assertEquals(96.8,Temperature.temperatureConversion(1));
		
	}

	
	

	
	
}
