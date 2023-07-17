package SLL;

import java.util.Stack;

public class SingleLinkedList {
	
	private Node head;
	private int count;
	
	public SingleLinkedList() {
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	

	public String getCount() {
		return "Count:" + count;
	}

	public void display() {
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		
		if(newNode==null)   //out of space
		{
			return false;
		}
		
		if(head==null)  //empty list
		{
			head=newNode;
			count++;
			return true;
		}
		
		//find the last node
		
		Node temp=head;
		
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		
		temp.setNext(newNode);	
		count++;
		return true;
	}
	
	public boolean insert(int data,int position)
	{
		if(position<1 || position>count)
		{
			return false;
		}
		
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		
		if(position==1) {   //1st position
			head=newNode;
			count++;
			return true;
		}
		
		Node prev=head;
		
		for(int i=1;i<position-1;i++)
		{
			prev=prev.getNext();
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		count++;
		return true;
		
	}
	
	public boolean deletebyPosition(int position)
	{
		if(position<1 && position>count)
			return false;
		Node deletable=head;
		if(position==1)
		{
			head=deletable.getNext();
			return true;
		}
		
		Node prev=head;
		
		for(int i=1;i<position;i++) {
			prev=deletable;
			deletable=deletable.getNext();
		}
		prev.setNext(deletable.getNext());
		
		return true;
	}
	
	public boolean deleteByVal(int data) {
		
		Node deletable=head;
		Node prev=head;
		
		if(deletable.getData()==data)
		{
			head=deletable.getNext();
			return true;
		}
		
		while(deletable.getData()!=data)
		{
			prev=deletable;
			deletable=deletable.getNext();
		}
		prev.setNext(deletable.getNext());
		
		return true;
	}
	
	public void displayRev()
	{
		Node temp=head;
		Stack<Node> s=new Stack<Node>();
		
		while(temp!=null)
		{
			s.push(temp);
			temp=temp.getNext();
		}
		while(!s.isEmpty())
		{
			System.out.print(s.pop().getData()+" ");
		}
		System.out.println();
	}
	
	public void reverse() {
		Node n1=head;
		Node n2=head.getNext();
		Node n3=null;
		
		while(n2!=null)
		{
			n3=n2.getNext();
			n2.setNext(n1);
			n1=n2;
			n2=n3;
		}
		head.setNext(null);
        head = n1;
	}
	
	

}
