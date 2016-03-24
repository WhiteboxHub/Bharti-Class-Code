package com.main;

public class StringOperations {

	//function to copunt vowels
	//smitha sinha
	public int countVowels(String str)
	{
		int count = 0;
		str = str.toLowerCase();
		for(int i = 0;i<str.length();i++)
		{
			if(str.charAt(i) == 'a'
					|| str.charAt(i) == 'i'
					|| str.charAt(i) == 'e'
					|| str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
			{
				count++;
			}
		}
		return count;
	}
}
