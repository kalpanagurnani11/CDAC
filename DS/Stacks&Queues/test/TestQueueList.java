package com.demo.test;

import com.demo.stacks.CircularQueue;
import com.demo.stacks.MyQueueLinkList;

public class TestQueueList {

	public static void main(String[] args) {
		MyQueueLinkList que=new MyQueueLinkList();
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
