package com.demo.test;

import com.demo.stacks.CircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		CircularQueue que=new CircularQueue();
		que.enqueue(11);
		que.enqueue(12);
		que.enqueue(13);
		que.enqueue(14);
		que.enqueue(10);
		que.enqueue(11); //queue is full
		while(!que.isEmpty()) {
			System.out.println(" data : "+que.dequeue());
		}
	}

}
