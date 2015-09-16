package com.main;

public class PrintMessage {

	String message;
	
	public PrintMessage(String mesage)
	{
		this.message = message;
	}
	
	public String printMsg()
	{
		return message;
	}
	
	public String printWelcomeMessage()
	{
		return "welcome" + message;
	}
	
	public String printByeMessage()
	{
		return "bye"  + message;
	}
}
