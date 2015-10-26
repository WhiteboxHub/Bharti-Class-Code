package com.advanced;

public abstract class Shape {
	
	public Shape() {

      System.out.println("shape constructor");
	}
	
	abstract void draw();
	abstract void draw(int a);
	
	void print()
	{
		System.out.println("creating a shape");
	}

}
