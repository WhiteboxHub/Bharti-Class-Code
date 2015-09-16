package com.main;

import java.util.Arrays;

public class Example {

	//sort a string alphabets
	public String sortString(String str)
	{
		char[] arr = str.toCharArray();
		//Arrays.sort(arr);
		 for(int i = 0;i<arr.length-1;i++)
		 {
			 for(int j= i+1;j>0;j--)
			 {
				 if(arr[j] < arr[j-1])
				 {
					 char temp = arr[j];
					 arr[j] = arr[j-1];
					 arr[j-1] = temp;
				 }
			 }
		 }
		 
		str = String.valueOf(arr);
		return str;
	}

}
