package com.advanced;

public class Student implements Comparable{
	
	int age;
	String name;
	
	public Student(int age , String name) {
		this.age = age;
		this.name = name;
	}

	public int compareTo(Object o)
	{
		Student s = (Student)o;
		if(age == s.age)
			return 0;
		else if(age < s.age)
			return 1;
		else
			return -1;
	}
}
