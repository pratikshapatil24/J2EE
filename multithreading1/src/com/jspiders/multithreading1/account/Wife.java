package com.jspiders.multithreading1.account;

public class Wife extends Thread{
	
	Account account;
	public Wife(Account account) {
		this.account=account;
		
	}
	@Override
	public void run() {
		account.deposit(3000);
		account.withDraw(300);
	}

}
