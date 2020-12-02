package com.jlt.generic;

public class GenericDemo {
	public static void main(String[] args) {
		ShowLivingCreatureName<Person> shower = new ShowLivingCreatureName<>();
		Person person = new Person();
		shower.getData(person).printName();
		
		ShowLivingCreatureName<Dog> shower1 = new ShowLivingCreatureName<>();
		Dog dog = new Dog();
		shower1.getData(dog).printName();
		
		printArray(new String[] {"Aung Aung", "Zaw Zaw"});
		
	}
	
	private static <E> void printArray(E[] array) {
		for(E e : array) {
			System.out.println(e);
		}
	}
}

interface LivingCreature{
	void printName();
}

class Person implements LivingCreature{

	@Override
	public void printName() {
		System.out.println("Mg Mg");
	}
	
}

class Dog implements LivingCreature{

	@Override
	public void printName() {
		System.out.println("Jackie");
	}
	
}

class ShowLivingCreatureName<T extends LivingCreature>{
	public T getData(T data) {
		return data;
	}
}
