package Stack;

public class Stack<T> {
	private T[] arr;
	private int size;
	private int top;
	private int count;
	
	public Stack(int size) {
		top=-1;
		this.size=size;
		arr= (T[]) new Object[size];
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == (size-1);
	}
	
	public boolean push(T data)
	{
		if(isFull())
			return false;
		arr[++top]=data;
		count++;
		return true;
	}
	
	public T pop()
	{
		if(isEmpty())
			return null;
		count--;
		return arr[top--];
	}
	
	public T peek()
	{
		if(isEmpty())
			return null;
		return arr[top];
	}

	public void getCount() {
		System.out.println("Count:"+count);
	}
	
}
