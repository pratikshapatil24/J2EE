package com.jspiders.multithreading1.moviebookapp;

public class BookTheaterSeat {
	int total_seats=10;
	void bookSeat(int seats) {
		if (total_seats >=seats) {
			System.out.println(seats+"seats booked succesfully");
			total_seats= total_seats-seats;
			System.out.println("Seats left : "+total_seats);
			
		} else {
			System.out.println("Sorry seats cannot booked ....!");
			System.out.println("seats left : "+total_seats);

		}
	}

}
