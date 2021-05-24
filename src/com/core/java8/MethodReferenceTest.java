package com.core.java8;

public class MethodReferenceTest {

	public static void main(String[] args) {
		
		/*
		 * FunctionalOwnInterface f = ()->System.out.println("implement of method ref");
		 * f.singleFunction();
		 */
		
		
		/**
		 * Method Reference example : it replacement of Lambda expression
		 */
		FunctionalOwnInterface ownRef = Test :: add;
		ownRef.singleFunction();
	}
	
	
	
	 
	



}

class Test {
	
	public static void add() {
		System.out.println("Implemented Method Ref");
	}
}