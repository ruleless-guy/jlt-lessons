package com.jlt.oop.abstraction.polymorphism;

public class StaticBinding {
	public static void main(String[] args) {
		TunTun.role();
		DawMya.role();
		NuNu.role();
	}
}

class TunTun{
	public static void role() {
		System.out.println("I am Tun Tun.");
	}
}

class DawMya extends TunTun{
	public static void role() {
		System.out.println("Tun Tun is son.");
	}
}

class NuNu extends TunTun{
	public static void role() {
		System.out.println("Tun Tun is brother");
	}
}
