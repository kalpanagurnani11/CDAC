package com.demo.stacks;

public class CircularQueue {
    private int[] arr;
    private int front,rear;
	public CircularQueue() {

		this.arr = new int[5];
		this.front = -1;
		this.rear = -1;
	}
	public CircularQueue(int size) {

		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isEmpty(){
		if(front==-1) {
			System.out.println("queue is empty");
			return true;
		}
		return false;
	}
	public boolean isFull(){
		if(front==0  && rear==arr.length-1) {  //front is smaller than rear
			System.out.println("Queue is full");
			return true;
		}else if(front==rear+1) { //rear is smaller than front
			System.out.println("Queue is full");
			return true;
		}
		System.out.println("Queue is not full");
		return false;
		
	}
	public boolean enqueue(int val){
		if(!isFull()) {
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%arr.length;
			arr[rear]=val;
			System.out.println("added successfully "+val);
			return true;
		}
		return false;
		
	}
	//delete one value from queue
	public int dequeue() {   //poll   delete
		if(!isEmpty()) {
			int n=arr[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}else {
				front=(front+1)%arr.length;
			}
			System.out.println("dequeue "+n);
            return n;
		}
		return -1;
	}
    
    
}
