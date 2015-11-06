package com.util;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	int id;
	String name;
	
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Student s1  = new Student(100, "nitisha");
		Student s2  = new Student(101, "shruti");
		Student s3  = new Student(102, "manjula");
		Student s4  = new Student(103, "susan");
		
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		
		int count = 0;
		
		for(Student s : list1)
		{
			if(count > 1)
			{
				break;
			}
			System.out.println("id is " + s.id );
			System.out.println("name is " + s.name );
			count++;
		}
		
		
		/*Iterator<Student> it = list1.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("id is " + s.id );
			System.out.println("name is " + s.name );
		}*/
	}
}
