package com.maersk.ssp;

import java.util.function.BiConsumer;

public class LamdaExp {
	
	public static void main(String[] args) {
		
		LamdaExp exp = new LamdaExp();
		exp.add(10, 10);
		
		BiConsumer<Integer, Integer> consume =  (a,b) ->System.out.println();
		consume.accept(10, 10);
		
	}

	public void add(int a,int b) {
		
		System.out.println(a+b);
	}
}
