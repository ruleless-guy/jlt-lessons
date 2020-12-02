package com.jlt.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		data.add("Mg Mg");
		data.add("Ma Ma");
		data.add("Mg Mg");
		
//		System.out.println(data.remove("Mg Mg"));
//		System.out.println(data.remove("Mg Mg"));
		
		Iterator<String> iterator = data.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			if(s.equals("Mg Mg")) {
				iterator.remove();
			}
		}
		System.out.println(data.size());
		
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1,"Mg Mg",21));
		personList.add(new Person(2,"Aung Aung",18));
		personList.add(new Person(3,"Hla Hla",21));
		
		Iterator<Person> it = personList.iterator();
		while(it.hasNext()) {
			Person value = it.next();
			if(value.getAge() == 21) {
				value.setName("Thaung Thaung");
			}
		}
		
		for(Person p : personList) {
			System.out.println(p.getName());
		}
		
	}
}



class Person{
	private int id;
	private String name;
	private int age;
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
