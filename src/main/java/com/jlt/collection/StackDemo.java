package com.jlt.collection;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> data = new Stack<>();
		data.push(1);
		data.push(2);
		data.push(3);
		data.addElement(4);
		
		System.out.println("Size -> "+data.size()+" "+data);
		System.out.println("Pop -> "+data.pop());
		System.out.println("Size -> "+data.size()+" "+data);
		System.out.println("Peek -> "+data.peek());
		System.out.println("Size -> "+data.size()+" "+data);
		System.out.println("Search 2 -> "+data.search(2));
		
	}
	
}
