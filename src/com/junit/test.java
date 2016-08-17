package com.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class test {
	@Test
	public void testAdd(){
		int a = 1;
		int b = 2;
		int c =a+b;
		
		assertTrue("123",a+b==4);
		assertTrue("123",a+b==c);
	}
	
	
	

}
