package com.ofss;

import static org.junit.jupiter.api.Assertions.*;
// junit testing code
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator c=new Calculator();
		int actual=c.add(10, 15);
		int expected=25;
		Assert.assertEquals(expected, actual);
	}

//	@Test
//	void testSub1() {
//		Calculator c=new Calculator();
//		int actual=c.sub(10, 5);
//		int expected=5;
//		Assert.assertEquals(expected, actual);
//	}

//	@Test
//	void testSub2() {
//		Calculator c=new Calculator();
//		int actual=c.sub(10, 100);
//		int expected=90;
//		Assert.assertEquals(expected, actual);
//	}
}
