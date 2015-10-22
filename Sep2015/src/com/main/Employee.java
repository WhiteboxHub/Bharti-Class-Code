package com.main;

public class Employee {

	int id;
	String name;
	//static String dpartment="HR";
	//static int counter = 0;
	Address address;
	
	public Employee(int id,String name,Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display()
	{
		System.out.println("employee details are " + id + " " + name);
		System.out.println("employee address is " + address.city + " " + address.state);
	}
	
/*	static
	{
		System.out.println("helo");
		Employee e1 = new Employee();
	}
	public Employee() {
		counter++;
		System.out.println("counter is " + counter);
	}
	public  void printID()
	{
		System.out.println("Hi we are iin Employee");
	}
	public void changeCounter()
	{
		counter++;
		printID();
	}
	*/
	//
	public static void main(String[] args) {
		System.out.println("hiii in main");
		Address a1 = new Address("dublin", "ca");
		Employee e1 = new Employee(1,"john",a1);
		
		}
	
}
