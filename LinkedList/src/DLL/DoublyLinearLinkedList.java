package DLL;

public class DoublyLinearLinkedList {
	
	private Node head;
	
	public DoublyLinearLinkedList() {
		head=null;
	}
		public void displayForward()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.getData()+" ");
				temp=temp.getNext(); 
			}
		}
	
	public void displayReverse()
	{
		Node temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext(); 
		}
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	
	public void insert(int data) {
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node prev=head;
		while(prev.getNext()!=null)
		{
			//System.out.println("123s");
			prev=prev.getNext();
		}
		prev.setNext(newNode);
		newNode.setPrev(prev);	
		
	}
	
	public boolean insert(int data ,int position)
	{
		Node newNode= new Node(data);
		if(position==1)
		{
			newNode.setNext(head);
			head.setPrev(newNode);
			head=newNode;
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<position-1;i++)
		{
			prev=prev.getNext();
		}
		newNode.setNext(prev.getNext());
		prev.getNext().setPrev(newNode);
		prev.setNext(newNode);
		newNode.setPrev(prev);
		return false;
	}
	
	
	

}
