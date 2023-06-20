package com.jspiders.multithreading1.waitandnotifyresourse;

public class Pizz {
	int noOfPizz;
	public synchronized void orderOfpizz(int OrderedPizz) {
		System.out.println("Order of Pizza: "+ OrderedPizz );
		if (OrderedPizz > noOfPizz) {
			System.out.println("Oderered pizzas not avaialable");
			System.out.println("Please wait......");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		noOfPizz = noOfPizz+OrderedPizz;
		System.out.println("order of  "+ OrderedPizz+" Ordered pizzas Sucessfully");
		
	}
	public synchronized void makePizza(int backedPiza) {
		System.out.println("Making "+backedPiza+" pizzas");
		noOfPizz = noOfPizz+backedPiza;
		System.out.println(noOfPizz+ " Pizzas Avaialable");
		this.notify();
		
		
	}
	

}
