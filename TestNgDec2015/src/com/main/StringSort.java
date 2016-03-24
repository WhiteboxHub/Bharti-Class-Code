package com.main;

import java.util.Arrays;

public class StringSort {
	

	
	//baarti -- abhirt
	public String sort(String str)
	{
		char[] arr = str.toCharArray();
		
		//Arrays.sort(arr);
		//abarti
		//aabrti
		for(int i = 1;i<arr.length;i++)
		{
			for(int j = 0;j<arr.length -1 ;j++)
			{
				if(arr[j] > arr[j+1])
				{
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(arr);
		str = String.valueOf(arr);
		
		return str;
		
		
	}
	
	public static void main(String[] args) {
		StringSort sr = new StringSort();
		sr.sort("bharti");
		
			}

}
