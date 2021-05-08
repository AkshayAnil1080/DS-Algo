package binarySearchTree;

public class DeletionInBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
    	root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	int x=15;
    	
    	root=delNode(root,x);
	    inorder(root);

	}
	
	public static Node getSuccessor(Node curr){
        curr=curr.right;
        while(curr!=null && curr.left!=null)
            curr=curr.left;
        return curr;
    }
    
    public static Node delNode(Node root, int x){
        if(root==null)
            return root;
        if(root.key>x)  // recur left
            root.left=delNode(root.left,x);
        else if(root.key<x) // recur right
            root.right=delNode(root.right,x);
        else{
            if(root.left==null){
                return root.right;   // root left == null , return root.right to parent call
            }
            else if(root.right==null){
                return root.left;   // root right == null , return root.left to parent call
            }
            else{
                Node succ=getSuccessor(root);  // left and right !=null , find the closest greater
                 root.key=succ.key;
                root.right=delNode(root.right,succ.key);  // call delNode for root.right as root of RST to delete the succ.
            }
        }
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
