package com.jspiders.multithreading1.Thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("MyThread2 is running");
		}
		
	}

}
