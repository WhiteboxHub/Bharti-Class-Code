package com.array;

public class StringExample {

	static void testStringBuffer()
	{
		StringBuffer buff = new StringBuffer("Welcome");
		buff.append("world");
		StringBuilder build = new StringBuilder("Welcome");
		build.append("world");
		
		//buff.
		String s = "Welcome";
		s.concat("world");
		System.out.println("buffer is " + buff);
		System.out.println("stringh is " + s);
	}
	
	
	public static void main(String[] args) {
		//String s = "Welcome";
		
		 /*System.out.println(s.charAt(0));
		 System.out.println(s.length());
		 
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 System.out.print(s.charAt(i));
		 }
		 
		 
		 String s1 = "Welcome";
		 String s2 = new String("Welcome");
		 
		 if(s.equals(s1))
		 {
			 System.out.println("Strings are equal");
		 }
		 
		 if(s.equals(s2))
		 {
			 System.out.println("2nd Strings are equal");
		 }
		 
		 
		 if(s == s2)
		 {
			 System.out.println("3rd string are equal");
		 }
		 else
		 {
			 System.out.println("Strings are not equal");
		 }*/
		 
		/* 
		 String substr = s.substring(3,6);
		 System.out.println("substring is " + s.lastIndexOf('c'));
		  String str ="Hello#World#6500";
		  String str1 = "hello";
		// int a  = Integer.valueOf(str1)
		 String[] ar = str.split(" ");
		 for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}*/
		/*s = s.replace("come", "go");
		 System.out.println(s.replace("come", "go"));
		 System.out.println(s);
		 
		 s = " bharti ";*/
		
		StringExample.testStringBuffer();
		 
		String s = "6500";
	}


}
