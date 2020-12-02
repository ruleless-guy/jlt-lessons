package com.jlt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortingDemo {
	
	public static void main(String[] args) {
		SortedSet<Integer> data = new TreeSet<>();
		data.add(3);
		data.add(1);
		data.add(5);
		data.add(2);
		data.add(4);
		
		for(Integer i : data) {
			System.out.println(i);
		}
		System.out.println("----------------------------");
		
		List<Man> men = new ArrayList<>();
		men.add(new Man(3,"Aung Aung"));
		men.add(new Man(1,"Zaw Zaw"));
		men.add(new Man(4,"Tun Tun"));
		men.add(new Man(2,"Mg Mg"));
		
		Collections.sort(men);
		
		for(Man m : men) {
			System.out.println(m.getId());
		}
		
	}

}

class Man implements Comparable<Man>{
	private int id;
	private String name;
	
	public Man(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(Man o) {
		return this.id - o.id;
	}
}
