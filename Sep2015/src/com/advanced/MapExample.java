package com.advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<>();
		
		//adding element to map
		 hm.put("101","bharti");
		 hm.put("ps" ,"priyanka");
		 hm.put("103", "shruti");
		 hm.put("104", "meena");
		 hm.put("105", "priyanka");
		 
		 System.out.println(hm);
		 
		 
		 //retrieve elements
		 for(Map.Entry m : hm.entrySet())
		 {
			 System.out.println(m.getKey() + " " + m.getValue());
		 }
		 
		
		 
		Set<String> s = hm.keySet();
		for(String i : s)
		{
			System.out.println(i);
		}
		 
		
		Collection<String> list = hm.values();
		for(String s1 : list)
		{
			System.out.println(s1);
		}
		 
		System.out.println(hm.get("105"));
		
		HashMap<Integer,String> hm1 = new HashMap<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(200);
		list1.add(201);
		list1.add(202);
		
		
		/*for(Integer i : list1)
		{
			hm1.put(100, i);
		}*/
		
	}
	
}
