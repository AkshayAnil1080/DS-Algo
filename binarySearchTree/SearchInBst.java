package binarySearchTree;
class Node  
{ 
  int key; 
  Node left; 
  Node right; 
  Node(int k){
      key=k;
      left=right=null;
  }
}
public class SearchInBst {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node root=new Node(15);
	    	root.left=new Node(5);
	    	root.left.left=new Node(3);
	    	root.right=new Node(20);
	    	root.right.left=new Node(18);
	    	root.right.left.left=new Node(16);
	    	root.right.right=new Node(80);
	    	int x=16;
	    	
	    	if(searchRec(root,x))
	    	    System.out.print("Found");
	    	else
	    	    System.out.print("Not Found");
	    	
	    	System.out.println();
	    	
	    	if(searchItr(root,x))
	    	    System.out.print("Found");
	    	else
	    	    System.out.print("Not Found");
	}
//	Recursive. TC : O(h) ASC: O(h)
	public static boolean searchRec(Node root, int x){
        if(root==null)
            return false;
        if(root.key==x)
            return true;
        else if(root.key>x){
            return searchRec(root.left,x);
        }else{
            return searchRec(root.right,x);
        }
    }
//	Iterative TC: O(h) ASC : O(h)
	public static boolean searchItr(Node root, int x){
        while(root!=null){
            if(root.key==x)
                return true;
            else if(root.key<x)
                root=root.right;
            else
                root=root.left;
        }
        return false;
    }

}
