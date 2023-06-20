package com.jspiders.multithreading1.waitandnotifyresourse;

public class PizzMain {
	public static void main(String[] args) {
		Pizz pizz = new Pizz();
		Friends friends = new Friends(pizz);
		Dominos dominos = new Dominos(pizz);
		friends.start();
		dominos.start();
	}
	

}
