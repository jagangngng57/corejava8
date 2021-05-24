package com.maersk.ssp;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {

public static void main(String[] args) {
	
	List<Integer> values = Arrays.asList(1,4,5,8,9,10);
	
	//External for loops;
	/*
	 * for(int i =0;i<values.size();i++) { System.out.println(values.get(i)); }
	 */
	//Henenced For loop
	
	/*
	 * for(int i: values) { System.out.println(i);
	 * 
	 * }
	 */
	 
	values.forEach(i->System.out.println(i));
}

}
