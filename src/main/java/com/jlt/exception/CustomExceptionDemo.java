package com.jlt.exception;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Harddisk");
		product.setPrice(50);
		
		CreditCard card = new CreditCard();
		card.setBalance(60);
		
		Person person = new Person(card);
		try {
			person.buy(product);
		} catch (BalanceNotEnoughException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

class Product{
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

class CreditCard{
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}

class Person{
	private CreditCard card;
	
	public Person(CreditCard card) {
		this.card = card;
	}
	
	public void buy(Product product) throws BalanceNotEnoughException {
		double balance = card.getBalance();
		if(balance < product.getPrice()) {
			throw new BalanceNotEnoughException("Your balance is not enough.");
		}else {
			balance -= product.getPrice();
			card.setBalance(balance);
			System.out.println("You've bought "+product.getName()+" and you have "+card.getBalance()+" left.");
		}
	}
}

class BalanceNotEnoughException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BalanceNotEnoughException(String message) {
		super(message);
	}
	
}
