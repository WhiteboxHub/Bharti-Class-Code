package com.advanced;

public class WarpperExample {

	public static void main(String[] args) {
		//conevrting primitive to wrapper.
		int i = 20;
		Integer l = Integer.valueOf(i);
	
		//Integer k = i;//autoboxing
		
		
		//Wrapper class to primitive types
		
		Integer p = new Integer(10);
		int z = p.intValue();
		
		//int z = p;//unboxing
	}
}
