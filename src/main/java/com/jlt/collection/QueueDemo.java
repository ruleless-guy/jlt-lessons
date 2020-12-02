package com.jlt.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<Integer> data = new PriorityQueue<>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		
		System.out.println("Size -> "+data.size()+" "+data);
		System.out.println("Poll -> "+data.poll());
		System.out.println("Size -> "+data.size()+" "+data);
		System.out.println("Peek -> "+data.peek());
		System.out.println("Size -> "+data.size()+" "+data);
		
		System.out.println("Element -> "+data.element());
	}

}
