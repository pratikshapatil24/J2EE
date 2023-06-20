package com.jspiders.multithreading1.main;

import com.jspiders.multithreading1.Thread.MyThread3;
import com.jspiders.multithreading1.Thread.MyThread4;

public class Thread2Main {
	public static void main(String[] args) {
		
		MyThread4 myThread4 = new MyThread4();
		
		MyThread3 myThread3 = new MyThread3();
		Thread thread =new Thread(myThread3);
		
        myThread4.setName("Thread 4");
        thread.setName("Thread 3");
		myThread4.setPriority(3);
	    thread.setPriority(5);
	    myThread4.start();
		thread.start();
		
	}

}
