package tress;

import java.util.Scanner;

public class Tree {

	static Scanner sc = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	sc = new Scanner(System.in);
	Node root  = createTree();
	System.out.println(root);

	}




static Node createTree()
	{
		Node root =null;
		System.out.println("enter data");
		int data = sc.nextInt();
		
		 if(data == -1) return null;
		 
		 root = new Node(data);
		 
		 System.out.println("enter left fot " + data);
		 root.left = createTree();
		 
		 System.out.println("enter right for " +  data);
		 root.right=  createTree();
		 
		 return root;
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

}