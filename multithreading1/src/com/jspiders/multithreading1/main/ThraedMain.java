package com.jspiders.multithreading1.main;

import com.jspiders.multithreading1.Thread.MyThread1;
import com.jspiders.multithreading1.Thread.MyThread2;

public class ThraedMain {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		 thread.start();
		 myThread1.start();
	}

}
