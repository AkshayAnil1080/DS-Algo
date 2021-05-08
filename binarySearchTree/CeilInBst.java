package binarySearchTree;

public class CeilInBst {  // node.data>=x

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(15);
    	root.left=new Node(5);
    	root.left.left=new Node(3);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(80);
    	int x=17;
    	
    	System.out.print("Floor: "+(ceil(root,17).key));
}

  public static Node ceil(Node root, int x){
        Node res=null;
        while(root!=null){
            if(root.key==x)  //1
                return root;
            else if(root.key>x) //2
	            {
	            	res=root;
	            	root=root.left;
	            }
                
            else //3
                root=root.right;

        }
        return res;
    } 

}
