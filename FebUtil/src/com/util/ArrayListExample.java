package com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
	
	
     void  get()
	{
		
		/*int i =1;
		while(i <= 10)
		{
			System.out.println(i);
			i++;
		}*/
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		//create an arraylist
		ArrayList<String> list = new ArrayList<String>();
		
		
		
		list.add("priya");
		list.add("kanchana");
		list.add("anupama");
		list.add("sandhya");
		list.add("prajitha");
		list.add("rina");
		
		
		Collections.sort(list,Collections.reverseOrder());
		//list.add(Integer.valueOf(100));
		
		//access the elements
		
		/*System.out.println(list.get(2));
		
		System.out.println(list);
		
		
		//int i = get();
		int count = 0;
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			count++;
			String element = it.next();
			System.out.println(element);
			if(count > 1)
				break;
		}
		
		
		//for each
		for(String s : list )
		{
			System.out.println(s);
		}
		
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		for(Integer i : numList)
		{
			System.out.println(i);
		}
		
		
		
		ListIterator<String> li = list.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("the backward list");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}*/
		
		
		
		
		//insert/remove
		
		list.add(2,"gowri");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.remove("anupama");
		System.out.println(list);
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("priya");
		list1.add("ssn1");
		list1.add("ssn2");
		list1.add("ssn3");
		
		/*list.addAll(list1);
		System.out.println(list);
		
		list.addAll(3, list1);
		System.out.println(list);*/
		
		list.retainAll(list1);
		System.out.println(list);
		
		/*list.removeAll(list1);
		System.out.println(list);*/
		
		
		/**/
		
		for(String i : list)
		{
			System.out.println(i);
		}
		
	}

}
