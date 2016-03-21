package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class StreamEx {
	
	static void method1() throws Exception
	{
		//write to a file
		FileOutputStream out = new FileOutputStream("C:/Users/Sampath/Desktop/test.text");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		String s = "Java is easy to learn!!!";
		
		byte[] b = s.getBytes();
		
		bout.write(b);
		
		bout.close();
		out.close();
		System.out.println("success");
		
		//read from a file
		
		FileInputStream in = new FileInputStream("C:/Users/Sampath/Desktop/read.text");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		int i = 0;
		while((i=bin.read()) != -1)
		{
			char c = (char)i;
			System.out.print(c);
		}
		
		in.close();
		
		
	}
	
	
	static void method2()throws Exception
	{
		/*FileOutputStream out1 = new FileOutputStream("C:/Users/Sampath/Desktop/write1.text");
		FileOutputStream out2 = new FileOutputStream("C:/Users/Sampath/Desktop/write2.text");
		
		String s = "holla";
		byte[] b = s.getBytes();
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(b);
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.flush();
		bout.close();*/
		
		FileInputStream in1 = new FileInputStream("C:/Users/Sampath/Desktop/write1.text");
		FileInputStream in2 = new FileInputStream("C:/Users/Sampath/Desktop/write2.text");
		
		SequenceInputStream seq = new SequenceInputStream(in1,in2);
		int i = 0;
		while((i = seq.read()) != -1)
		{
			System.out.print((char)i);
		}

	}
	
	static void method3() throws Exception
	{
		CharArrayWriter cw = new CharArrayWriter();
		String s = "Its all confusing!!!:(";
		cw.write(s);
		FileWriter fw = new FileWriter("C:/Users/Sampath/Desktop/write3.text");
		FileWriter fw1 = new FileWriter("C:/Users/Sampath/Desktop/write4.text");
	//	BufferedWriter buff = new BufferedWriter(fw);
		
		cw.writeTo(fw);
		cw.writeTo(fw1);
		
		//cw.write(s);
		cw.close();
		fw.close();
		
		FileReader fr = new FileReader("C:/Users/Sampath/Desktop/write1.text");
		BufferedReader br = new BufferedReader(fr);
		int i = 0;
		while((i=br.read()) != -1)
		{
			System.out.print((char)i);
		}
	}
	
	static void method4()throws Exception
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(read);
		
		String data = "";
		while(!data.equals("stop"))
		{
			System.out.println("Enter data");
			data = buff.readLine();
			System.out.println(data);
		}
	}
	
	static void method5() throws Exception
	{
		Console c = System.console();
		System.out.println("Enter name");
		String name = c.readLine();
		System.out.println(name);
		/*System.out.println("Enter pwd");
		char[] ch = c.readPassword();
		String pwd = String.valueOf(ch);
		System.out.println(pwd);*/
		
	}
	
	static void method6()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		System.out.println(sc.next());;
		System.out.println("enter id");
		System.out.println(sc.nextInt());
	}
	
	static void method7()
	{
		File file = new File("C:/Users/Sampath/Desktop/java");
		file.mkdir();
	}
	
	public static void main(String[] args) throws Exception{
		/*System.out.println("hiii");
		System.err.println("error");
		System.out.println("please enter");
		char c = (char)System.in.read();
		System.out.println(c);*/
		//StreamEx.method1();
		//StreamEx.method2();
		//StreamEx.method3();
		//StreamEx.method4();
		//StreamEx.method5();
		//StreamEx.method6();
		StreamEx.method7();
		
	}

}
