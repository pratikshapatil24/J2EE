package com.jspiders.multithreading1.moviebookapp;

public class MovieBookApp extends Thread {
	static 	BookTheaterSeat b;
	@Override
	public void run() {
		b.bookSeat(MAX_PRIORITY);
		
	}
	public static void main(String[] args) {
		b= new BookTheaterSeat();
		MovieBookApp deepk = new MovieBookApp();
		
	}
	

}
