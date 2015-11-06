package com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ListExample {
	
	//sort an array list with collection function
	static ArrayList<Integer> sortList(ArrayList<Integer> list)
	{
		
		//Collections.so
		
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i) > list.get(j))
				{
					int temp = list.get(i);//20
					list.set(i,list.get(j));
					list.set(j,temp);
					
				}
			}
		}
		
		Collections.synchronizedList(list);
		
		
		return list;
	}
	
	
	//function to access elements from a list in forward and backward direction
	static void accessElements(ArrayList<String> list)
	{
		
		ListIterator<String> it =  list.listIterator();
		
		//forward direction
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//backward direction
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		//creation of arraylist
		ArrayList<String> alist = new ArrayList<String>();
		//int a = 100;
		/*alist.add("Bharti");
		alist.add("sinha");
		alist.add("100");
		alist.add("laxmi");
		alist.add("susan");
		
		accessElements(alist);*/
		
		
		Vector<Integer> list1 = new Vector<>();
		list1.add(12);
		list1.add(10);
		list1.add(7);
		list1.add(12);
		list1.add(17);
		list1.add(1);
		
		Enumeration<Integer> en = list1.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		for(Integer i : list1)
		{
			System.out.println("before sorting"+ i);
		}
		
		//list1 = sortList(list1);
		
		
		for(Integer i : list1)
		{
			System.out.println("after sorting"+ i);
		}
		
	}

}
