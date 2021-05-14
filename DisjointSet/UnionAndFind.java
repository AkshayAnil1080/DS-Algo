package DisjointSet;

public class UnionAndFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		parent =  new int [5];
		
		intialize();
		
		union(2,4);
		union(0,4);
		
//	(0,2,4) ,1,3
		System.out.println(find(4));  
		System.out.println(find(3));
	}
	static int parent[], rank[];
	static void intialize() 
	{
		for( int i= 0; i<parent.length; i++)
			parent[i] = i;
	}
	static int find( int x)   //O(n) - worst case it forms a skew tree
	{
		if(parent[x] ==x)
			return x;
		return find(parent[x]);
	}
	static void union(int x, int y) // O(n) - worst case it forms a skew tree
	{
		int x_rep = find(x);
		int y_rep =  find(y);
		if(x_rep == y_rep) return ;
		parent[y_rep] = x_rep ; // or parent[x_rep] = y_rep
	}
	
	
	
}
