package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	//create a set
	static void createSet()
	{
		HashSet<String> mySet = new HashSet<String>();
		mySet.add("Bharti");
		mySet.add("Bharti");
		mySet.add("Sinha");
		mySet.add("whitebox");
		accessElements(mySet);
	}
	
	//accessing elements from a list
	
		static void accessElements(HashSet<String> set)
		{
			
			//iterator
			Iterator itr = set.iterator();
			while(itr.hasNext())
			{
				///100;
				System.out.println(" The elements in the list are : " + itr.next());
			}
		}
		
		//remove duplicates from an array
		static void removeAray()
		{
			int[] arr = {10,12,12,4,12,55,12};
			HashSet<Integer> mySet = new HashSet<Integer>();
			for(int i =0;i<arr.length;i++)
			{
				mySet.add(arr[i]);
			}
			
		for (Integer integer : mySet) {
			System.out.println(" the elements are" + integer);
		}
			
		}
		public static void main(String[] args) {
			//SetExample.createSet();
			SetExample.removeAray();
		}
}
