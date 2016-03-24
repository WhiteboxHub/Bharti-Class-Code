package com.main;

public class StringOp {

	
	public int countVowels(String str)
	{
		int count = 0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c == 'a' || c == 'i' || c == 'e'
					|| c == 'o' || c == 'u')
			{
				count++;
			}
			
		}
		
		return count;
	}
}
