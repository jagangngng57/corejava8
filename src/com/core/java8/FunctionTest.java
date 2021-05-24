package com.core.java8;

import java.util.function.Function;

public class FunctionTest {
	
	public static void main(String[] args) {
		
		//Java 7 code
		FunctionTest ftest = new FunctionTest();

		System.out.println(ftest.multiplyValue(5));
		
		//Function is functional interface and it accept the arguments and provide the result
		Function<Integer, Integer> value = i->i*i;
		System.out.println(value.apply(5));
	}
	
	//Java 7 code 
	public int multiplyValue(int i) {
		
		return i*i;
	}

}
