package com.advanced;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		/*mySet.add("Bharti");
		mySet.add("meena");
		mySet.add("priyanka");
		mySet.add("susan");
		mySet.add("shruti");
		mySet.add("rini");
		mySet.add("laxmi");
		mySet.add("Bharti");
		mySet.add(null);
		mySet.add(null);
		
		for(String set : mySet)
		{
			System.out.println(set);
		}
		
		Iterator<String> it = mySet.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		//ArrayList<String> list = new ArrayList<>();
		//HashSet<String> mySet = new HashSet<>();
	/*	list.add("bharti");
		list.add("laxmi");
		list.add("susan");
		list.add("meena");
		list.add("karan");
		list.add("bharti");
		list.add("bharti");
		
		for(String s : list)
		{
			System.out.println("before  " + s);
		}
		System.out.println(" ");
		mySet.addAll(list);
		list.clear();
		list.addAll(mySet);
		
		for(String s : list)
		{
			System.out.println(s);
		}*/
		
		
	//	LinkedHashSet<String> mySet = new LinkedHashSet<>();
		/*mySet.add("meena");
		mySet.add("priyanka");
		mySet.add("susan");
		mySet.add("shruti");
		mySet.add("rini");*/
		
		/*for(String s: mySet)
		{
			System.out.println(s);
		}*/
		
		TreeSet<String> mySet = new TreeSet<>();
		mySet.add("Vijay");
		mySet.add("Ajay");
		mySet.add("Rabi");
		mySet.add("Ravi");
		
		for(String s: mySet)
		{
			System.out.println(s);
		}
		
		
	}
}
