package com.main;

public class LargestNumber {
	
	//to find the largest number in a given array.
	public int findMax(int[] arr) 
	{
		int num = arr[0];
		for(int i =1;i<arr.length;i++)
		{
			if(num < arr[i])
			{
				num = arr[i];
			}
		}
		
		return num;
	}

	/*public static void main(String[] args) {
		LargestNumber ln = new LargestNumber();
		int[] arr = {23,4,6,33,23,67};
		
		System.out.println("the largest number is " + ln.findMax(arr));
	}*/
}
