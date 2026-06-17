package com.demo;

	class Node {
	int data;
	Node prev,next;
	
	Node(int data)
	{
		this.data=data;
		}

}
public class single{
	Node head;
	
	void add(int data)
	
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
			
		}
		temp.next=newnode;
		newnode.prev=temp;
	}
	
	public void addAtBeginning(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		return;
	}
	
	private void display() {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+ " -> ");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
	public void delete(int data)
	{
	
		if(head.data==data)
		{
			head=head.next;
			return;
				
		}
		
			 Node temp=head;
			 while(temp.next!=null && temp.next.data!=data)
			 {
				 temp=temp.next;
			 }
			 temp.next=temp.next.next;
			 if(temp.next!=null)
			 {
				 temp.next.prev=temp;
			 }
			
		
			}
	public void reverse()
	{
		Node prev=null;
		Node curr=head;
		Node temp;
		
		while(curr!=null)
		{
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
			
		}
		head=prev;
	}
	
	
	
	public static void main(String args[])
	{
		single sl=new single();
		sl.add(10);
		sl.add(20);
		sl.addAtBeginning(30);
		sl.display();
	sl.reverse();
	
		sl.display();
		sl.delete(20);
		sl.display();
		
		
	}




	
	
	
}
