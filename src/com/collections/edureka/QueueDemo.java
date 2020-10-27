package com.collections.edureka;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i = 10; i > 0; i--) {
			queue.add(i);
	}
		//Peeking -> Obtaining the head of the queue
		//Polling -> Removing the head of the queue
		
		System.out.println("Queue size : " + queue.size());
		System.out.println("the head of the queue is : " + queue.peek()); //Head of the queue : 1
		
		
		queue.poll(); //Removing the head 1
		System.out.println("queue size after poll is : " + queue.size());
		
		System.out.println("the head of the queue is : " + queue.peek()); //New head of the queue : 2
		
	}
}
