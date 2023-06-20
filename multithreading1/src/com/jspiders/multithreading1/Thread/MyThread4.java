package com.jspiders.multithreading1.Thread;

public class MyThread4 extends Thread{
	@Override
	public void run() {
		System.out.println("The name of the thread is "+ Thread.currentThread().getName());
		System.out.println("The name of the priority is "+Thread.currentThread().getPriority());
	}

}
