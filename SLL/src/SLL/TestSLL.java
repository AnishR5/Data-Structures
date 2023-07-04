package SLL;

public class TestSLL {

	public static void main(String[] args) {
		
		SinglyLinkedList sll=new SinglyLinkedList();
		
		sll.insert(20);
		//sll.display();
		sll.insert(10);
		//sll.display();
		sll.insert(15);
		//sll.display();
		sll.insert(99, 2);
		//sll.display();
		System.out.println(sll.getCount()); 
		sll.insert(65);
		//sll.display();
		sll.insert(33, 4);
		sll.display();
		//sll.deletebyPosition(1);
//		sll.display();
//		sll.deletebyPosition(3);
//		sll.display();
//		sll.deletebyPosition(4);
//		sll.display();
//		sll.deleteByVal(20);
//		sll.display();
//		sll.deleteByVal(15);
//		sll.display();
		sll.displayRev();
		
	}

}
