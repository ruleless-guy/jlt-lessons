package com.jlt.oop.abstraction.polymorphism;

public class DynamicBinding {
	
	public static void main(String[] args) {
		MgMg mgmg = new MgMg();
		MgMg mother = new DawHla();
		MgMg susu = new SuSu();
		
		mgmg.role();
		mother.role();
		susu.role();
	}
	
}

class MgMg{
	
	public void role() {
		System.out.println("I am Mg Mg.");
	}
	
}

class DawHla extends MgMg{
	@Override
	public void role() {
		System.out.println("Mg Mg is son.");
	}
}

class SuSu extends MgMg{
	@Override
	public void role() {
		System.out.println("Mg Mg is brother");
	}
}
