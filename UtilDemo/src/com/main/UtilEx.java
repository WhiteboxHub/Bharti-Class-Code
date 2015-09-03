package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;

public class UtilEx {

	//read properties
	static void readProp()
	{
		FileInputStream input;
		try {
			input = new FileInputStream(new File("C:\\Users\\Sampath\\Desktop\\IOFiles\\MyProp.properties"));
		
		Properties prop = new Properties();
		prop.load(input);
		String property = prop.getProperty("username");
		System.out.println("The property value is " + property);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void readDate()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		System.out.println("The curent date is" + format.format(d));
		
		//Calendar cal  = new Calendar();
		//cal.//
	}
	
	static void readRandom()
	{
		Random random = new Random();
		int r = random.nextInt(3);
		if(r == 0)
		{
			System.out.println("rock");
		}
		else if(r ==1)
		{
			System.out.println("paper");
		}
		else
			System.out.println("scissor");
		
	}
	
	static void readResource()
	{
		ResourceBundle bundle = ResourceBundle.getBundle("resource/MyResource", Locale.getDefault());
		System.out.println(bundle.getString("first_name") + "is Bharti");
		bundle = ResourceBundle.getBundle("resource/MyResource", Locale.ITALIAN);
		System.out.println(bundle.getString("first_name") + "is Bharti");
	}
	public static void main(String[] args) {
		//UtilEx.readProp();
		//UtilEx.readDate();
		//UtilEx.readRandom();
		UtilEx.readResource();
	}
}
