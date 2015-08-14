package com.wb;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
	//	String str1 = "Hello All";
	//	String str2 = new String("Hello All");
		/*if(str == str1)
		{
			System.out.println("first Strings are equal");
		}
		if(str == str2)
		{
			System.out.println("second Strings are equal");
		}		if(str == str2)*/

		
		
	
		
		
		
		//Equals
		/*if(str.equals(str2))
		{
			System.out.println("strings are equal");
		}*/
		
		//System.out.println("character at location 2" + str.charAt(2));
		
		//System.out.println(str.compareTo("Heklo"));
		
		
		if(str.contains("ooo"))
			System.out.println("present");
		else
			System.out.println("Not present");
		
		
		System.out.println("index is" + str.substring(1,3));
		
		System.out.println("conctaed string is " + str.concat(" world"));
		
		
		//StringBuffer and StringBuilder
		
		StringBuffer buff = new StringBuffer("Aloha");
		System.out.println(buff.append("world"));
		
		
		StringBuilder build = new StringBuilder("Aloha1");
		
		
		
		//string1 > string 2 ===1
		//string1 < string 2 === -1
		//string1 = string 2 ===0
		

	}

}
