package com.main;

public class Main {
	
	 static final int salary;
	 final int bonus = 5000;
	
	static
	{
		salary = 9000;
	}
	
	final void print()
	{
		System.out.println("printing");
	}
	public static void main(String[] args) {
		/*CITIBank citi = new CITIBank();
		System.out.println(citi.getRateOfInterest());
		ChaseBank chase = new ChaseBank();
	    System.out.println(chase.getRateOfInterest());*/
		
		/*Bank b = new CITIBank();// upcasting
		System.out.println(b.getRateOfInterest());
		
		//Bank b1 = new CITIBank();
		CITIBank b1 = (CITIBank)b;
		
		System.out.println(b1.getRateOfInterest());*/
		
		Main m = new Main();
		System.out.println(m.bonus);
		System.out.println(Main.salary);
	}
}
