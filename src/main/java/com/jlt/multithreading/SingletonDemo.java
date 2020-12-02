package com.jlt.multithreading;

public class SingletonDemo {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runner());
		Thread thread2 = new Thread(new Runner());
		Thread thread3 = new Thread(new Runner());
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class Runner implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Hey");
			Singleton.getInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Object created");
	}
	
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}