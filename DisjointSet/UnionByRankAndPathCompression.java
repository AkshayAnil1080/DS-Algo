package DisjointSet;
//without anything: O(N)
//with Union by Rank: O(logN)
//with Path Compression: O(α(N)) which is inverse Ackermann function.
public class UnionByRankAndPathCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int n =5;
				parent =  new int [5];
				rank =  new int[5];
				intialize();
				
				unionViaRank(2,4);
				unionViaRank(0,4);
				
//			(0,2,4) ,1,3
				System.out.println(find(4));  
				System.out.println(find(3));
	}
	static int parent[], rank[];
	static void intialize() 
	{
		for( int i= 0; i<parent.length; i++)
			{ parent[i] = i;rank[i]=0;}
	}
	static int find( int x)   //O(n) - worst case it forms a chaining in simple sol - rep of num is x -  rep for freinds of num also x - make rep the parent of num -  so next time want to find(num or for its freinds), it will be faster.
	{
		if(parent[x] ==x)
			return x;
		parent[x] = find(parent[x]);
		return parent[x];
	}
	static void unionViaRank(int x, int y) // O(logn)-  jiska rank bada usko parent bana do
	{
		int x_rep = find(x);
		int y_rep =  find(y);
		if(x_rep > y_rep) parent[y_rep] = x_rep ;
		else if(x_rep < y_rep) parent[x_rep] = y_rep ;
		else
		{parent[y_rep] = x_rep ; // or parent[x_rep] = y_rep ; rank[y_rep]++; rep may change for every friends.
		rank[y_rep]++;
		}
	}
}
