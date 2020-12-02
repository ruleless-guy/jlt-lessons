package com.jlt.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class CollectionDemo {
	public static void main(String[] args) {
		
		List<Integer> data1 = new ArrayList<>();
		data1.add(1);
		data1.add(3);
		System.out.println(data1.get(1));
		System.out.println("Data1 size : "+data1.size());
		System.out.println();
		
		List<Integer> data2 = new LinkedList<>();
		data2.add(4);
		data2.add(8);
		data2.add(null);
		System.out.println(data2.get(2));
		System.out.println("Data2 size : "+data2.size());
		System.out.println();
		
		Set<String> data3 = new HashSet<>();
		data3.add("Mg Mg");
		data3.add("Kaung Kaung");
		data3.add(null);
		data3.add("Mg Mg");
		System.out.println("Data3 size : "+data3.size());
		System.out.println();
		
		Map<String,String> data4 = new HashMap<>();
		data4.put("d","Mg Mg");
		data4.put("c", "Aung Aung");
		data4.put("e", null);
		data4.put(null, "e");
		data4.put("d","Aye Aye" );
		System.out.println(data4);
		System.out.println("Data4 size : "+data4.size());
		
		for(Map.Entry<String, String> out : data4.entrySet()) {
			System.out.println(out.getKey()+" : "+out.getValue());
		}
		
	}
}
