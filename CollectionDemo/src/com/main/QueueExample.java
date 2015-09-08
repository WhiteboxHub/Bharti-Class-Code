package com.main;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	
	static void createQueue()
	{
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("BVharti");
		queue.add("ang");
		queue.add("pushpa");
		queue.add("seena");
		queue.add("sudha");
		queue.add("tarandep");
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	public static void main(String[] args) {
		QueueExample.createQueue();
	}
}
