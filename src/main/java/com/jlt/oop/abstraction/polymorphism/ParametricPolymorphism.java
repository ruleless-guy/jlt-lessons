package com.jlt.oop.abstraction.polymorphism;

import java.util.List;
import java.util.ArrayList;

public class ParametricPolymorphism {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		List<Animal> animals = new ArrayList<>();
		animals.add(cat);
		animals.add(dog);
		for(Animal a : animals) {
			a.greet();
		}
	}
}


interface Animal{
	 void greet();
}

class Cat implements Animal{

	@Override
	public void greet() {
		System.out.println("Meow");
	}
	
}

class Dog implements Animal{

	@Override
	public void greet() {
		System.out.println("Woof");
	}
	
}







