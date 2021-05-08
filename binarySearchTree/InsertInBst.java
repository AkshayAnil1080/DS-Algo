package binarySearchTree;

public class InsertInBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node root=new Node(10);
	    	root.left=new Node(5);
	    	root.right=new Node(15);
	    	root.right.left=new Node(12);
	    	root.right.right=new Node(18);
	    	int x=18;
	    	
	    	root=insert(root,x);
		    inorder(root);
		    
		    System.out.println();
		    root=insertItr(root,x);
		    inorder(root);
	}
//	 	 Recursive : O(h)  ASC :O(h)
	 public static Node insert(Node root, int x){
	        if(root==null)
	            return new Node(x);
	        else if(root.key<x)
	            root.right=insert(root.right,x);
	        else if(root.key>x)
	            root.left=insert(root.left,x);
	        return root;
	    }
	 
	 //Itertatice TC :O(h) ASC: O(1)
	 public static Node insertItr(Node root, int x){
	        Node temp=new Node(x);
	        Node parent=null,curr=root;
	        while(curr!=null){
	            parent=curr;
	            if(curr.key>x)
	                curr=curr.left;
	            else if(curr.key<x)
	                curr=curr.right;
	            else
	                return root;
	        }
	        if(parent==null)
	            return temp;
	        if(parent.key>x)
	            parent.left=temp;
	        else
	            parent.right=temp;
	        return root;
	    }
	    
	    public static void inorder(Node root){
	        if(root!=null){
	            inorder(root.left);
	            System.out.print(root.key+" ");
	            inorder(root.right);
	        }    
	    }
}
