package com.main;

public class LargestNumber {
	
	
	//find largest number from a given array==10 25 2 65 26
	public int getLargest(int[] arr)
	{
		int max = arr[0];
		
		for(int i =1;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		
		
		return max;
	}
	
	/*public static void main(String[] args) {
		
		int[] arr = {10,25,2,65,26};
		
		LargestNumber ln = new LargestNumber();
		int max = ln.getLargest(arr);
		
		System.out.println("the largest number is " + max);
		
		
	}*/

}
