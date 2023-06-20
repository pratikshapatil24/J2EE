package com.jspiders.multithreading1.main;

import com.jspiders.multithreading1.Thread.MyThread5;

public class Thread5main {
	public static void main(String[] args) {
		MyThread5 myThread5 =new MyThread5();
		myThread5.setName("Thread 5");
		myThread5.start();
	}

}
