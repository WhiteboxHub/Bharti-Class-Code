package com.util;

import java.util.ArrayList;
import java.util.Collections;

public class Candidate implements Comparable{
	
	int id;
	String name;
	int age;
	
	Candidate(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Object obj)
	{
		Candidate can = (Candidate)obj;
		
		if(age == can.age)
			return 0;
		else if(age > can.age)
			return 1;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		ArrayList<Candidate> canList = new ArrayList<>();
		
		
		Candidate c1 = new Candidate(10, "nilam",23);
		Candidate c2 = new Candidate(11, "prajitha",27);
		Candidate c3 = new Candidate(14, "sivangi",20);
		canList.add(c1);
		canList.add(c2);
		canList.add(c3);
		
		Collections.sort(canList);
		
		System.out.println(canList);
		
		for(Candidate c : canList)
		{
			System.out.println(c.age + " " + c.name + " " + c.id);
		}
	}

}
