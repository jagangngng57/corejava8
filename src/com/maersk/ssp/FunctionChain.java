package com.maersk.ssp;

import java.util.function.Function;

public class FunctionChain {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> doub = i->2*i;
		System.out.println("Double it : "+doub.apply(2));
		
		Function<Integer, Integer> triple = i->i*i*i;
		
		System.out.println("Triple it : "+triple.apply(2));
		
		System.out.println("andThen : is " +doub.andThen(triple).apply(2));
		System.out.println("Compose : is " +doub.compose(triple).apply(2));
		
	}

}
