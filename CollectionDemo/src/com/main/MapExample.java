package com.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	//create map
	  static void createMap()
	  {
		  HashMap<Integer,String> myMap = new HashMap<>();
		  myMap.put(100, "amit");
		  myMap.put(101, "bharti");
		  myMap.put(102, "sampath");
		  myMap.put(103, "ruby");
		  
		  for(Map.Entry map : myMap.entrySet())
		  {
			  System.out.println(map.getKey() + " " + map.getValue());
		  }
		  
		  Set<Integer> set = myMap.keySet();
		  for (Integer integer : set) {
			System.out.println(integer);
		}
		  
		 Collection<String> values =   myMap.values();
		 for (String string : values) {
			System.out.println(string);
		}
		  
	  }
	  
	  public static void main(String[] args) {
		MapExample.createMap();
	}
	}
