
package SCLL;

public class SinglyCircularLL {
	private Node head;
	private int count;
	
	public SinglyCircularLL() {
		head=null;
	}
	public int getCount() {
		return count;
	}
	public boolean insert(int data)
	{
		Node newNode=new Node(data);
		if(head==null)  //list empty
		{head=newNode;
			newNode.setNext(head);
			count++;
			return true;
	 	}
		Node prev=head;
		while(prev.getNext()!=head)
		{
			prev=prev.getNext();
		}
		newNode.setNext(head);
		prev.setNext(newNode);
		//head = n
		count++;
		return true;
	}
	
	public boolean insertAtFirstPos(int data,int position)
	{
		if(position<1 || (head==null && position>1))
			return false;
		Node newNode=new Node(data);
		Node prev=head;
//		for(int i=1;i<=position;i++)
//		{
//			prev=prev.getNext();
//		}
		while(prev.getNext()!=head)
		{
			prev=prev.getNext();
		}
		System.out.println("prev:"+prev.getData());
		if(position==1)
		{
			newNode.setNext(head);
			head=newNode;
			prev.setNext(newNode);
		}
		return true;
	}
	
	
	public boolean insert(int data,int position)
	{
		if(position<1 || (head==null && position>1))
			return false;
		
		Node newNode=new Node(data);
		Node prev=head;
		for(int i=1;i<position-1;i++)
		{
			prev=prev.getNext();
		}
		
		System.out.println("prev:"+prev.getData());
		if(position==1)
		{
			return insertAtFirstPos(data,1);	 
		}
		else
		{			
			if (prev.getNext()==head)
				{
					prev.setNext(newNode);
					newNode.setNext(head);
					count++;
					return true;
				}
				else
				{
					newNode.setNext(prev.getNext());
					prev.setNext(newNode);
					count++;
					return true;
				}
		}
		
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void display()
	{
		Node temp=head;
		if(isEmpty())
			return;
		
		do {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}while(temp!=head);
		System.out.println();
	}
	
	public void delete()
	{
		Node deletable=head;
		Node prev=head;
		while(deletable.getNext()!=head) {
			prev=deletable;
			deletable=deletable.getNext();
		}
		count--;
		prev.setNext(head);
	}
	
	public void deleteByPosition(int position)
	{
		Node deletable=head;
		Node prev=head;
		
		if(position==1)
		{
			while(prev.getNext()!=head)
			{
				prev=prev.getNext();
			}
			prev.setNext(head.getNext());
			head=head.getNext();
			return;
		}
		
		for(int i=1;i<position;i++)
		{
			prev=deletable;
			deletable=deletable.getNext();
		}
		if(deletable.getNext()!=head)
		prev.setNext(deletable.getNext());
		else {
			prev.setNext(head);
		}
		
	}
	
	public void deleteByVal(int data)
	{
		Node deletable=head;
		Node prev=head;
		
		while(deletable.getData()!=data)
		{
			prev=deletable;
			deletable=deletable.getNext();
		}
		if(deletable==head)
		{
			while(prev.getNext()!=head)
			{
				prev=prev.getNext();
			}
			prev.setNext(head.getNext());
			head=head.getNext();
			return;
		}
		if(deletable.getNext()!=head)
			prev.setNext(deletable.getNext());
			else {
				prev.setNext(head);
			}
		
	}
	
}
