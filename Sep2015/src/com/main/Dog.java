package com.main;

public class Dog extends Animal{
	
	
	   void eat()
	   {
		   System.out.println("dog is eating");
	   }

		static void eat1(Animal a)
		{
			Dog d = (Dog)a;
			d.eat();
		}
		
		
		public static void main(String[] args) {
			
			Animal a = new Dog();
			Dog.eat1(a);
		}
}
