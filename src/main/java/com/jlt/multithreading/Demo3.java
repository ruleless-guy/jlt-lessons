package com.jlt.multithreading;

public class Demo3 {
	public static void main(String[] args) {
		final Processor processor = new Processor();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				processor.consumer();
			}
			
		});
		
		thread2.start();
		thread1.start();
		
	}
}

class Processor{
	public void producer() throws InterruptedException {
		
		synchronized (this) {
			System.out.println("Producer is working");
			wait();
			System.out.println("Producer is resuming");
		}
		
	}
	
	public void consumer() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			System.out.println("Consumer is working");
			notify();
		}
		
	}
}
