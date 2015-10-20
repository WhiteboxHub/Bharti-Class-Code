package com.main;

public class ConstructorExample {
	
	int id;
	int age;
	String name;

	ConstructorExample()
	{
		id = 10;
		age = 20;
	}
	
	ConstructorExample(int i , String n)
	{
		id = i;
		name = n;
	}
	
	ConstructorExample(int i , String n,int a)
	{
		id = i;
		name = n;
		age =  a;
	}
	ConstructorExample(ConstructorExample ex)
	{
		id = ex.id;
		
	}
	
	void show()
	{
		System.out.println("id is " + id + "age is " + age + "name is " + name);
	}
	
	public static void main(String[] args) {
				ConstructorExample ex1 =  new ConstructorExample(20,"bharti1");
				ConstructorExample ex2 =  new ConstructorExample(ex1);
				ex2.id = ex1.id;		
	}
}
