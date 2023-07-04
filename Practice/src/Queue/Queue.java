package Queue;

public class Queue {
	
	private int[] arr;
	private int front,rear,size;
	
	public Queue(int size) {
		
		this.size = size;
		arr=new int[size];
		front=rear=-1;
	}
	
	public boolean isEmpty()
	{
		return ((front == -1 && rear==-1) || (front>rear));
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	
	public boolean insert(int data)
	{
		if(isFull())
			return false;
		arr[++rear]=data;
		if(front==-1)
			front=0;    // implies index is updated to 0, indicating that the queue is no longer empty.
		return true;
	}
	
	public int delete() {
		if(isEmpty())
			return -1;
		return arr[front++];
	}
	
	public void display()
	{
		if(rear>=0)
		{
			for(int i=0;i<=rear;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
	

}
