package DS;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		this.head=null;
	}
	
	
	
	public Node getHead() {
		return head;
	}



	public void setHead(Node head) {
		this.head = head;
	}
	
	public void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}



	public boolean insert(int data)
	{
		Node newNode= new Node(data);
		
		if(newNode==null)      //new Node is null
		{	return false;
		}
		 
		if(head==null)      //head is null ==> list is empty new node will be added on 1st position
		{
			head=newNode;
			return true;
		}
		
		if(head!=null)    //which implies list is not empty  // new node will be the last node if LL
		{
			//first we need to locate last node then assign its next to new node
			Node last=head;
			while(last.getNext()!=null)
			{
				last=last.getNext();
			}
			last.setNext(newNode);
			return true;
		}
		
		return false;
			
	}
	
	public boolean insert(int data,int position)
	{
		if(position<1)
			return false;
		
		Node newNode =new Node(data);
		
		if(position==1)
		{
			//System.out.println(head.getNext());
			//System.out.println(head);
			newNode.setNext(head);
			//newNode.setNext(head.getNext());  //both are okay
			head=newNode;
			return true;
		}
		
		Node prev=head;
		
		for(int i=1;i<position -1;i++)
		{
			prev=prev.getNext();
			if(prev== null)
				return false;
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		
		
		
		return true;
	}
	
	public boolean deletebyVal(int data)
	{
		//find the deletable node
		
		if(head==null)     //empty list
			return false;
		
		if(head.getData()==data)
		{	head=head.getNext();
			return true;
		}
		
		
		Node del=head;
		while(del.getNext()!=null)
		{	
			if(del.getData()==data)
				break;
			
		}
		
		return false;
	}
	
	
	

}
