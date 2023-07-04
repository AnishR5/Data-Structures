package Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<Integer> ints=new Stack<Integer>(5);
		System.out.println(ints.isEmpty());
		System.out.println(ints.isFull());
		ints.push(25);
		ints.getCount();
		ints.push(11);
		ints.push(12);
		ints.push(13);
		ints.push(15);
		ints.push(16);
		ints.getCount();
		ints.push(18);
		ints.push(17);
		ints.getCount();
		System.out.println(ints.pop());
		ints.getCount();
		System.out.println(ints.pop());
		ints.getCount();
		
		

	}

}
