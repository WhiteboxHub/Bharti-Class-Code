import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.Scanner;


public class IoExample {

	//read from a file: FileInputStream
	static void readFile(String path)
	{
		FileInputStream in;
		try {
			 in = new FileInputStream(path);
			 int i;
			 while((i=in.read()) != -1)
			 {
				
				 System.out.print((char)i);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//writing into a file
	static void writeFile(String path)
	{
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		try {
			 out = new FileOutputStream(new File("C:\\Users\\Sampath\\Desktop\\IOFiles\\output3.txt"));
			 bout = new BufferedOutputStream(out);
			 String s = " We are writing into the file";
			 bout.write(s.getBytes());
			 System.out.println("Success");
			 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				bout.close();
				bout.flush();
				out.close();
				out.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void writeToMultipleFiles()
	{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		FileOutputStream out1 = null;
		FileOutputStream out2 = null;
		 try {
			out1 = new FileOutputStream(new File("C:\\Users\\Sampath\\Desktop\\IOFiles\\output1.txt"));
		    out2 = new FileOutputStream(new File("C:\\Users\\Sampath\\Desktop\\IOFiles\\output2.txt"));
		    out.write(100);
		    out.writeTo(out1);
		    out.writeTo(out2);
		 } catch (FileNotFoundException e) {
			 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					out.close();
					out.flush();
					out1.close();
					out1.flush();
					out2.close();
					out2.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	}
	
	//read from 2 files and we are going to copy into 1 file.
	static void copyData()
	{
		FileOutputStream out1 = null;
		FileInputStream in1 = null;
		FileInputStream in2 = null;
		SequenceInputStream sis = null;
		try {
			in1 = new FileInputStream(new File("C:\\Users\\Sampath\\Desktop\\IOFiles\\input1.txt"));
			in2 = new FileInputStream(new File("C:\\Users\\Sampath\\Desktop\\IOFiles\\input2.txt"));
			 sis = new SequenceInputStream(in1,in2);
			out1 = new FileOutputStream(new File("C:\\Users\\Sampath\\Desktop\\IOFiles\\output1.txt"));
			int i;
			while((i=sis.read()) != -1)
			{
				out1.write(i);
			}
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		finally{
			try {
				in1.close();
			//	in2.flush();
				out1.close();
				out1.flush();
				in2.close();
				sis.close();
				//out2.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	//read from a file: FileInputStream
		static void readFileReader(String path)
		{
			FileReader in;
			try {
				 in = new FileReader(path);
				 int i;
				 while((i=in.read()) != -1)
				 {
					
					 System.out.print((char)i);
				 }
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		//writing into a file
		static void writeFileWrite(String path)
		{
			FileWriter out = null;
			BufferedWriter bout = null;
			try {
				 out = new FileWriter(new File("C:\\Users\\Sampath\\Desktop\\IOFiles\\output3.txt"));
				 bout = new BufferedWriter(out);
				 String s = " We are writing into the file";
				 bout.write(s);
				 System.out.println("Success");
				 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					bout.close();
					out.close();
					
					//out.flush();
					//bout.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		static void readFromConsole()
		{
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(reader);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your name");
			String name;
			try {
				name = br.readLine();
				System.out.println("My name is " + name);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	public static void main(String[] args) {
		String path = "C:\\Users\\Sampath\\Desktop\\IOFiles\\input1.txt";
		//File file = new File("C:\\Users\\Sampath\\Desktop\\IOFiles\\input1.txt");
		//if(file.exists())
		
		//IoExample.readFile(path);
		//IoExample.writeFile(path);
		//IoExample.writeToMultipleFiles();
		//IoExample.copyData();
		//IoExample.readFileReader(path);
		//IoExample.writeFileWrite(path);
		IoExample.readFromConsole();
	}
}
