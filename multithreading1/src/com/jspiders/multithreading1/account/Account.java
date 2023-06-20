package com.jspiders.multithreading1.account;

public class Account {
	
	double accountBalance;//Declare data
	
	// Constructor
    public Account(double accountBalance) { 
		this.accountBalance = accountBalance;
	}
    
    //Method Create
	public double checkBalance() {
		return this.accountBalance;
		
	}
	
	// Created non Static method
	public synchronized void deposit(double amount) {
		System.out.println("Deposited " + amount + " in account" );
		accountBalance = accountBalance + amount;
		System.out.println("Current Balance "+checkBalance());
		
		System.out.println("***************************************");
	}
	
	// Create Non Static Method
	public synchronized void withDraw(double amount) {
		System.out.println("Withdrawing "+ amount + "in the account");
		accountBalance = accountBalance - amount;
		System.out.println("Current Balance "+ checkBalance());
		System.out.println("******************************************");
		
	}
	

}
