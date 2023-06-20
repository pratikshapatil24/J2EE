package com.jspiders.multithreading1.account;

public class Husband extends Thread {
	Account account;
	public Husband(Account account) {
		this.account=account;
		
	}
	@Override
	public void run() {
		account.deposit(1000);
		account.withDraw(500);
		
	}

}
