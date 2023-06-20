package com.jspiders.multithreading1.waitandnotifyresourse;

public class Dominos extends Thread {
	private Pizz pizz;
	public Dominos(Pizz pizz) {
		this.pizz=pizz;
		
		
	}
	@Override
	public void run() {
		pizz.makePizza(40);
	}
	

}
