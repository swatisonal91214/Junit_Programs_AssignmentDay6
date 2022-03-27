package com.bl.sqrt;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareRootTest {
	
	@Test
	public void test() {
		assertEquals(25.0,SquareRoot.sqrt(625));
	}
	
}
