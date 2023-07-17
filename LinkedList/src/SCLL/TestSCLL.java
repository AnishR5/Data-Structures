package SCLL;

public class TestSCLL {
	public static void main(String[] args) {
		
		SinglyCircularLL scll=new SinglyCircularLL();
		scll.insert(25);
		scll.insert(11);
		//scll.insert(1, 1);
		//System.out.println(scll.getCount());
		scll.display();
		scll.insert(99);
		scll.insert(22);
		scll.display();
//		scll.delete();
//		scll.display();
		//scll.deleteByPosition(4);
		scll.deleteByVal(25);
		scll.display();
	
//		scll.insertAtFirstPos(45,1);
//		scll.display();
//		
//		scll.insert(56,2);
//		scll.display();
//		scll.insert(60,6);
//		scll.display();
		
		
	}

}
