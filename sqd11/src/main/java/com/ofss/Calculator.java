package com.ofss;

import org.apache.log4j.Logger;

// Development Code
public class Calculator {
	static Logger calcLogger=Logger.getLogger("Calculator");
	public int add(int a, int b) {
		return a+b; 
	}
	
	public int sub(int a, int b) {
		int result=0;
		int result1=0; // unused variable, code smell
		// introduce branching with if ...else comment
		// Another comment
		if (a > b) {
			result=a-b;
		}
		if (b > a) {
			result=b-a;
		}
		return result;
	}
}
