package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ListExample {

	//accessing elements from a list
	
	static void accessElements(ArrayList list)
	{
		
		//foreach
		/*for(Object obj : list)
		{
			System.out.println(" The elements in the list are : " + obj);
		}*/
		//iterator
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			///100;
			System.out.println(" The elements in the list are : " + itr.next());
		}
	}
	//adding element to arraylist
	static void addToList()
	{
		ArrayList<String> list =  new ArrayList<String>();
		list.add("Bharti");
		list.add("whitebox");
		list.add("Sinha");
		list.get(0);
		//int i;
		accessElements(list);
		sortList(list);
		
		/*LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Bharti");
		
		Stack<String> stack = new Stack<>();
		stack.push("Bharti");
		stack.push("whitebox");
		 stack.pop();*/
	}
	
	//sort elements in the list
	static void sortList(ArrayList<String> myList)
	{
		Collections.sort(myList);
		accessElements(myList);
	}
	public static void main(String[] args) {
	///	ListExample ex = new ListExample();
		//ex.addToList();
		ListExample.addToList();
	}
}
