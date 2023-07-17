package BST;

import java.util.Scanner;

public class TestBST {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
		bst.insert(10);
		bst.insert(90);
		bst.insert(100);
		bst.insert(40);
		bst.insert(70);
		bst.insert(80);
		bst.insert(60);
		bst.insert(20);
		System.out.println("PreOrder:");
		bst.preorder();
		bst.preorderWithoutRecursion();
		System.out.println("Inorder: ");
		bst.inorder();	
		bst.inorderWithoutRecursion();
		System.out.println("Postorder: ");
		bst.postorder();
		System.out.println("Height:"+bst.heightOfTree());
		bst.preorderWithoutRecursion();
		System.out.println("Enter number to search");
		int num=sc.nextInt();
		Node x=bst.bsfalgo(num);
		if(x==null)
			System.out.println("Number not found");
		else
		System.out.println("Node found at by bsf:"+x);
		
		Node y=bst.dsfalfo(num);
		if(y==null)
			System.out.println("Number not found");
		else
		System.out.println("Node found at by dsf:"+y);
		
		Node z=bst.BinarySearch(num);
		if(z==null)
			System.out.println("Number not found");
		else
		System.out.println("Node found at by binary serach:"+z);
		
		Node [] nodes=bst.BinarySearchwithParent(num);
		for(Node i:nodes)
		{
			if(i==null)
				System.out.println("Node not found");
			else
				System.out.println("child and parent:"+i);
		}
		
		
		bst.deleteAll();
		
		System.out.println("after deletion:");
		System.out.println("Height:"+bst.heightOfTree());
	}

}
