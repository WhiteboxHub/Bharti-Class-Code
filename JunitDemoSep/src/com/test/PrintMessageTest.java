package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.PrintMessage;

public class PrintMessageTest {

	@Test
	public void testMessage()
	{
		PrintMessage msg = new PrintMessage();
		String actual = msg.getMessage("Kirti");
		assertEquals("Hi Kirti",actual);
	}
}
