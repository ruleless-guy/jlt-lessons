package com.jlt.oop.abstraction.polymorphism;

public class AdHostPolymorphism {
	public static void main(String[] args) {
		char c = 'A';
		byte b = 10;
		short s = 200;
		int i = 2500;
		long l = 36000;
		float f = 23.4f;
		double d = 3.14;
		
		show(c);
		show(i);
		show(l);
		show(f);
		show(l);
		
		FastFoodRestaurant kfc = new KFC();
		kfc.order(Food.Hamburger);
		kfc.order(Food.RiceSpicy,Juice.LemonTea);
	}
	
	public static void show(double d) {
		System.out.println("Value is "+d);
	}
	
	
}

enum Food{
	RiceSpicy , Hamburger
}

enum Juice{
	CocaCola , LemonTea
}

interface FastFoodRestaurant{
	void order(Food food);
	void order(Juice juice);
	void order(Food food , Juice juice);
}

class KFC implements FastFoodRestaurant{

	@Override
	public void order(Food food) {
		System.out.println("Orders : "+food);
	}

	@Override
	public void order(Juice juice) {
		System.out.println("Orders : "+juice);
	}

	@Override
	public void order(Food food, Juice juice) {
		System.out.println("Orders : "+food+" and "+juice);
	}
	
}
