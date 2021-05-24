package com.core.java8;

 public class MyThread extends Thread{
	public MyThread() {
		System.out.println("MyThread");
	}
	
	public void run() {
		System.out.println("some");
	}
	public void run(String s) {
		System.out.println("string");
	}

}

 class TestThread {
	
	public static void main(String[] args) {
		Thread t = new MyThread() {
			public void run() {
				System.out.println("bar");
			}
		};
		t.start();
	}
}
