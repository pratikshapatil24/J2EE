package com.jspiders.multithreading1.Thread;

public class MyThread3 implements Runnable {
	@Override
	public void run() {
		System.out.println("The name of the Thread is: "+Thread.currentThread().getName());
		System.out.println("The Pripority of the trhead is: "+Thread.currentThread().getPriority());
	}

}
