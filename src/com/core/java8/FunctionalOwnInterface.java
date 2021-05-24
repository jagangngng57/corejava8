package com.core.java8;


@FunctionalInterface
public interface FunctionalOwnInterface {

	public void singleFunction();
	default void add() {
		System.out.println("added value");
	}
	static void added() {
		System.out.println("static value");
	}
}
