package com.maersk.ssp;


interface LamdaTest{
	
	void show(int i);
}

class LamdaImpl implements LamdaTest{
	
	public void show(int i) {
		
		System.out.println("Lamda Test is in Impl class " +i);
	}
}
public class LamdaDemo {
	
	public static void main(String[] args) {
		
		 LamdaTest test; 
		
		/*
		 * test = new LamdaImpl(); test.show(8);
		 */
		
		/*
		 * LamdaTest test = new LamdaTest() {
		 * 
		 * 
		 * 
		 * public void show(int i) { System.out.println("its in Annonmous class is "+i);
		 * 
		 * } };
		 */		
		test = (i) -> System.out.println(i);
		test.show(8);
		
		
		
	}

}
