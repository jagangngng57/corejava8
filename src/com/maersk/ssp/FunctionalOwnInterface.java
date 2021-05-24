package com.maersk.ssp;


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
