package com.advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortExample{

	public static void main(String[] args) {
		/*Student s1 = new Student(11, "dfgdfg");
		Student s2 = new Student(10, "vij");
		Student s3 = new Student(15, "abhi");
		Student s4 = new Student(12, "sm");
		
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Collections.sort(list,new AgeComparator());
		
		for(Student s : list)
		{
			System.out.println(s.age + " " + s.name);
		}
		
		
		Collections.sort(list,new NameComparator());
		
		for(Student s : list)
		{
			System.out.println(s.age + " " + s.name);
		}*/
		
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(1004);
		list1.add(99);
		list1.add(1230);
		list1.add(1);
		
	//	Collections.sort(list1);
		//Collections.reverse(list1);
		
		
		Collections.sort(list1, 
				new Comparator<Integer>() {
			public int compare(Integer o1 ,Integer o2)
			{
				return o2.compareTo(o1);
			}
		});
		
		
		for(Integer i : list1)
			System.out.println(i);
		
	}
}
