package com.core.java8;

public class A {

	public void printName() {
		System.out.println("A");
	}
}

class B extends A{
	
	public void printName() {
		System.out.println("B");
	}
}

class C extends A{
	
	public void printName() {
		System.out.println("C");
	}
	

}

class Tested{
	
	
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		
	}
}