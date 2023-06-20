package com.jspiders.multithreading1.waitandnotifyresourse;

public class Friends extends Thread {
	private Pizz pizz;
	public Friends(Pizz pizz) {
		this.pizz=pizz;
		}
	@Override
	public void run() {
		pizz.orderOfpizz(20);
	}

}
