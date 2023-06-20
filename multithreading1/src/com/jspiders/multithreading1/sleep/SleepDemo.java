package com.jspiders.multithreading1.sleep;

public class SleepDemo {
	public static void main(String[] args) {
		String msg="This is the execution of sleep()";
		for(int i=0;i<msg.length();i++) {
			System.out.print(msg.charAt(i));
			try {
				Thread.currentThread();
				Thread.sleep(200);// it is accept the long variable as an argument
			} catch (InterruptedException e) {// it throw the interupted exception
				e.printStackTrace();
				
			}
			
		}
		
	}

}
