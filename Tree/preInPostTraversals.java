package tress;


import java.util.Scanner;

import tress.Tree.Node;

public class preInPostTraversals {
	static Scanner sc = null;// just type this line 4 wil automatically come.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		Node root  = createTree();
		System.out.println(root);
		
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();

	}
	static class Node    // creating a node with its left and right pointer
	{
		Node left, right;
		int data;
		public Node(int data)
		{
			this.data = data;
		}
	}
	
	static Node createTree()
	{
		Node root =null;
		System.out.println("enter data");
		int data = sc.nextInt();
		
		 if(data == -1) return null;
		 
		 root = new Node(data);
		 
		 System.out.println("enter left for " + data);
		 root.left = createTree();
		 
		 System.out.println("enter right for " +  data);
		 root.right=  createTree();
		 
		 return root;
	}
	
	static void preOrder(Node root)
	{
		if(root== null) return;
		
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	static void inOrder(Node root)
	{
		if(root== null) return;
		
	
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}
	static void postOrder(Node root)
	{
		if(root== null) return;
		
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");
		
	}
}
