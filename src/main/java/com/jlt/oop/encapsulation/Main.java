package com.jlt.oop.encapsulation;

public class Main {
	
	public static void main(String[] args) {
		
		Student std = new Student();
		std.setId(1);
		std.setName("Khun Alpha");
		std.setAge(22);
		
		System.out.printf("ID : %d%nName : %s%nAge : %d%n",std.getId(),std.getName(),std.getAge());
		
	}
	
}
