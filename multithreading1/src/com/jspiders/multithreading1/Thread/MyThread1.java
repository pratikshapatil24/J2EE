package com.jspiders.multithreading1.Thread;

import java.util.Iterator;

public class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("MyThread 1 is running thread");
			
		}
	}
}
