package Queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.insert(25);
		q.display();
		q.insert(11);
		q.display();
		q.insert(12);
		q.insert(13);
		q.insert(14);
		q.display();
		q.insert(77);
		q.display();
	}

}
