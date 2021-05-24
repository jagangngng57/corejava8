package com.core.java8;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		

		PredicateTest test = new PredicateTest();
		
		System.out.println(test.checkString("jk"));
		
		Predicate<String> checkStringleng = s->s.length()>=5;
		System.out.println(checkStringleng.test(("jkwww")));
		
	}
	
	public boolean checkString(String s) {
		if(s.length()>=5) {
			return true;
		}else {
			return false;
		}
	}

}
