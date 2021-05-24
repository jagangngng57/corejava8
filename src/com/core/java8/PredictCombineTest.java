package com.core.java8;

import java.util.function.Predicate;

public class PredictCombineTest {
	
	public static void main(String[] args) {
		
		Predicate<String> checkLength = s->s.length()>=5;
		
		System.out.println("String Length is : "+checkLength.test("Jagadeesh"));
		
		Predicate<String> evenCheck = s->s.length()%2==0;
		
		System.out.println("Even Check for String :"+evenCheck.test("Jagadeesh"));
		
		System.out.println("And condition : " +checkLength.and(evenCheck).test("jagadeesh"));
		
		System.out.println("Or condition : " +checkLength.or(evenCheck).test("jagadeesh"));

		System.out.println("Nagate condition :" +checkLength.negate().test("jagadeesh"));

		
	}

}
