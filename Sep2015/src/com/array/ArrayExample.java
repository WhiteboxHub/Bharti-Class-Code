package com.array;

public class ArrayExample {

	//to find largets number in a given array
	 int largest(int[] arr)
	{
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
				
				return max;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];//declartion,creation
		/*arr[0] = 10;//initialoization
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println("the third element is array is "  + arr[2]);*/
		
		//int i = 10;
		
		
		int[] arr1 = {1000,23,56,89,45,891};
		ArrayExample ex = new ArrayExample();
		//int i = ex.largest(arr1);
		//System.out.println("largets numvber is " + i);
		//largest(arr1);
		
		int[] id = {12,52,56,89,89124,56,59,45};
		
		for(int i = 0;i<id.length-1;i++)
		{
			System.out.println("ids are " + id[i]);
		}
		
		int[][] a = new int[2][2];
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		
		
		int[][] a1 = {{12,13},{12,14}};
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j =0;j<a1.length;j++)
			{
				System.out.println("element are" + a1[i][j]);
			}
		}
		
	}
	
	//sort the elements in array
	
	//smallest number
}
