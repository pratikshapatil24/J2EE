package com.jspiders.multithreading1.Thread;

public class MyThread5 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			if (i==3) {
				this.stop();
				
			}
			System.out.println(this.getName()+" is now running");
			
		}
	}

}
