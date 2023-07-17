package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree() {
		root=null;
	}

	public Node getRoot() {
		return root;
	}

	public void insert(int data)
	{
		Node newNode= new Node(data);
		if(root==null)   //tree is empty or a null tree
			{root=newNode;
				return;
			}
		
		Node prev=root;
		while(prev!=null)
		{		
		if(newNode.getData()<prev.getData())
		{
			if(prev.getLeft()!=null)
				prev=prev.getLeft();
			else
			{	prev.setLeft(newNode);
				break;
			}
		}
		else  //newNode data> prev data
		{
			if(prev.getRight()!=null)
				prev=prev.getRight();
			else
			{
				prev.setRight(newNode);
				break;
			}
		}
		}
	}
	
	public void preorder(Node node)
	{
		if(node==null)
			return;
		System.out.print(node.getData()+" ");
		preorder(node.getLeft());
		preorder(node.getRight());
	}
	
	public void preorder()
	{
		preorder(root);
		System.out.println();
	}
	
	public void preorderWithoutRecursion()
	{
		System.out.println("PreOrder without recursion:");
		Stack<Node> s=new Stack<>();
		Node node=root; 
		
		while(node!=null || !s.isEmpty()) {
		while(node!=null)
		{
			System.out.print(node.getData()+" ");
			if(node.getRight()!=null)
				s.push(node.getRight());
			
			node=node.getLeft();		
		}
		if(!s.isEmpty())
		node=s.pop();
		}
		System.out.println();
	}
	
	public void inorder(Node node)
	{
		if(node==null)
			return;
		inorder(node.getLeft());
		System.out.print(node.getData()+" ");
		inorder(node.getRight());
	}
	
	public void inorder()
	{
		inorder(root);
		System.out.println();
	}
	
	public void inorderWithoutRecursion()
	{System.out.println("inorderWithoutRecursion");
		Stack<Node> s=new Stack<Node>();
		Node node=root;
		while(node!=null || !s.isEmpty())
		{
			while(node!=null)
			{
				s.push(node);
				node=node.getLeft();
			}
			if(!s.isEmpty()) {
			node=s.pop();
			System.out.print(node.getData()+" ");
			node=node.getRight();}
		}
		System.out.println();
	}
	
	public void postorder(Node node)
	{
		if(node==null)
			return;
		postorder(node.getLeft());
		postorder(node.getRight());
		System.out.print(node.getData()+" ");
	}
	
	public void postorder()
	{
		postorder(root);
		System.out.println();
	}
	
	public void deleteAll(Node node)
	{
		if(node==null)
			return;
		deleteAll(node.getLeft());
		deleteAll(node.getRight());
		node.setLeft(null);
		node.setRight(null);
		node=null; 
	}
	
	public void deleteAll()
	{
		deleteAll(root);
		root=null;
	}
	
	public int heightOfTree(Node root)
	{
		if(root==null)
			return -1;
		int hl=heightOfTree(root.getLeft());
		int hr=heightOfTree(root.getRight());
		int max=hl>hr?hl:hr;
		return max+1;
	}
	public int heightOfTree()
	{
		return heightOfTree(root);
	}
	
	public Node bsfalgo(int key)
	{
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		Node trav;
		while(!q.isEmpty())
		{
			trav=q.remove();
			if(key==trav.getData())
				return trav;
			if(trav.getLeft()!=null)
				q.add(trav.getLeft());
			if(trav.getRight()!=null)
				q.add(trav.getRight());
		}
		return null;
		
	}
	
	public Node dsfalfo(int key)
	{
		Stack<Node> stack=new Stack<Node>();
		Node trav;
		stack.push(root);
		while(!stack.isEmpty())
		{
			trav=stack.pop();
			if(trav.getData()==key)
				return trav;
			if(trav.getRight()!=null)
				stack.push(trav.getRight());
			if(trav.getLeft()!=null)
				stack.push(trav.getLeft());
			
		}
		
		return null;
	}
	
	public Node BinarySearch(int key)
	{
		Node trav=root;
		
		while(trav!=null) {
		if(trav.getData()==key)
			return trav;
		if(key>trav.getData())
			trav=trav.getRight();
		else
			trav=trav.getLeft();
		}
		
		return null;
	}
	
	public Node[]  BinarySearchwithParent(int key)
	{
		Node trav=root;
		Node parent=null;
		while(trav!=null)
		{
			if(trav.getData()==key)
				return new Node[] {trav,parent};
			parent=trav;
			if(key>trav.getData()) 
				trav=trav.getRight();
				
			else 
				trav=trav.getLeft();
			
		}
		return new Node[] {null,null};
	}
		

}
