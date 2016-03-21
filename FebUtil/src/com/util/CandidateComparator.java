package com.util;

import java.util.Comparator;

public class CandidateComparator implements Comparator{
	
 
	public int compare(Object obj1,Object obj2)
	{
		Candidate can1 = (Candidate)obj1;
		Candidate can2 = (Candidate)obj2;
		
		if(can1.age == can2.age)
			return 0;
		else if(can1.age > can2.age)
			return 1;
		else
			return -1;
	}
	
	
	

}
