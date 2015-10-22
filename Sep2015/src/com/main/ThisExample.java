package com.main;

public class ThisExample {
	int id;
	String name;
	
	public ThisExample(int id) {
	  System.out.println(this);
	}
	
	public ThisExample(int id, String name) {
		
		  this.id = id;
		  this.name = name;
		  
				  
		}
	void display()
	{
		Employee1 e1 = new Employee1(this);
		e1.test(this);
		System.out.println("id is " + id +"and name is  " + name);
	}
	
	public static void main(String[] args) {
				ThisExample ex1 = new ThisExample(5,"john");
		   ex1.display();
		
	}
}
