package com.maersk.ssp;

import java.util.Comparator;

public class Compares {

	
	public static void main(String[] args) {
		String[] cities = {"Bang","Newyork","Pune"};
		
	}
	
	static class MySort implements Comparator {
		
		public int compare(String s,String b) {
			return b.compareTo(s);
		}

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}
