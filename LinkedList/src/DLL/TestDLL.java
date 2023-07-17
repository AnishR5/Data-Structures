package DLL;

public class TestDLL {

	public static void main(String[] args) {
		DoublyLinearLinkedList dll=new DoublyLinearLinkedList();
		
		
		dll.insert(25);
		//dll.displayForward();
		
		dll.insert(26);
		dll.insert(27);
		dll.insert(28);
		dll.insert(24, 1);
		dll.insert(65, 3);
		dll.displayForward();

	}

}
