package com.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Stack;

public class UtilEx {
	
	static void localeEx()
	{
		ResourceBundle bundle = ResourceBundle.getBundle("com.util.config",Locale.ITALIAN);
		System.out.println(Locale.ITALIAN+ "---" + bundle.getString("message.hello"));
		
		
		Locale.setDefault(new Locale("in","ID"));
		bundle = ResourceBundle.getBundle("config");
		
		System.out.println(Locale.getDefault()+ "---" + bundle.getString("message.hello"));
	}
	
	static void dateEx()
	{
		
		
		SimpleDateFormat f = new SimpleDateFormat("dd-mm-yyyy");
		Date d = new Date();
		
		System.out.println(f.format(d));
		
		System.currentTimeMillis();
		
		Random ran = new Random();
		System.out.println(ran.nextInt());
	}
	
	static void stackEx()
	{
		//LIFO
		Stack<Integer> stack = new Stack<>();
		stack.push(100);
		stack.pop();
	}
	
	static void loadProperties()
	{
		try{
		FileReader file = new FileReader("config.properties");
		
		Properties prop = new Properties();
		prop.load(file);
		
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("pwd"));
		
		Enumeration e = prop.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		//UtilEx.loadProperties();
		//UtilEx.localeEx();
		UtilEx.dateEx();
		/*ArrayList<Integer> list = new ArrayList<>();
		
		list.add(106);
		list.add(102);
		list.add(108);
		list.add(10);
		
		
		System.out.println(list);
		
		Collections.sort(list);

		System.out.println(list);*/
		
		
          /*   ArrayList<Candidate> canList = new ArrayList<>();
		
		
		Candidate c1 = new Candidate(10, "nilam",23);
		Candidate c2 = new Candidate(11, "prajitha",27);
		Candidate c3 = new Candidate(14, "sivangi",20);
		canList.add(c1);
		canList.add(c2);
		canList.add(c3);
		
		Collections.sort(canList,new CandidateComparator());
		
		System.out.println(canList);
		
		for(Candidate c : canList)
		{
			System.out.println(c.age + " " + c.name + " " + c.id);
		}*/
	}

}
