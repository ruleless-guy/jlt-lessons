package com.jlt.multithreading;


class Cup{
	private int coffee;
	
	public Cup(int coffee) {
		this.coffee = coffee;
	}
	
	public void drink() {
		int localCoffee = coffee;
		localCoffee--;
		System.out.print("Drink");
		try {
			Thread.sleep((long)Math.random()*3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coffee = localCoffee;
	}
	
	public void pour() {
		
		int localCoffee = coffee;
		localCoffee++;
		System.out.print("Pour");
		try {
			Thread.sleep((long)Math.random()*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coffee = localCoffee;
	}
	
	public int getCoffee() {
		return coffee;
	}
}


class Waiter extends Thread{
	private Cup cup;
	
	public Waiter(Cup cup) {
		this.cup = cup;
	}
	
	@Override
	public void run() {
		synchronized (cup) {
			for(int i = 0; i<10; i++) {
				cup.pour();
			}
			cup.notify();
		}
		
	}
}

class Customer extends Thread{
	private Cup cup;
	
	public Customer(Cup cup) {
		this.cup = cup;
	}
	
	@Override
	public void run() {
		
		synchronized (cup) {
			if(cup.getCoffee() == 0) {
				try {
					cup.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int i = 0; i<10; i++) {
				cup.drink();
			}
		}
		
	}
}


public class Demo2 {
	public static void main(String[] args) {
		Cup cup = new Cup(0);
		Waiter waiter = new Waiter(cup);
		Customer customer = new Customer(cup);
		
		customer.start();
		waiter.start();
		
		
		try {
			waiter.join();
			customer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n"+cup.getCoffee());
	}
}
