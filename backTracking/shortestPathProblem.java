package recursion;

public class shortestPathProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {
				{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
				{0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
				{0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
				{1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
				{0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
				{1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
				{0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
				{0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
				{0, 0, 1, 0, 0, 1, 1, 0, 0, 1},
				};
		int result = shortestPath(a, 0, 0, 8, 0);   // output:16
//		int result = shortestPath(a, 0, 0, 0, 9);   // not possible returns 100001;
		if(result >=100000) {
			System.out.println("No path possible");
		}
		else
		System.out.println(result);
		}
	static int shortestPath(int a[][], int i, int j , int x, int y)
	{
		int rows = a.length;
		int cols =  a[0].length;
		boolean vis[][] = new boolean[rows][cols];
		return shortestPath(a,i,j,x,y,vis);
		
	}
	static boolean isValid(int a[][] ,int i, int j, boolean vis[][])
	{
		int rows = a.length;
		int cols =  a[0].length;
		return i>=0 && j>=0 && i<rows && j<cols && a[i][j]==1 && !vis[i][j];
		
	}
	
	static int shortestPath(int a[][], int i, int j , int x, int y, boolean vis[][])
	{   
		if(!isValid(a,i,j,vis)) return 100000;   // validation of nest visiting node
		// if src is the dest return
		if(i==x && j==y) return 0 ;
		
		vis[i][j]=true;
		int left = shortestPath(a,i,j-1,x,y,vis)+1;
		int right = shortestPath(a,i,j+1,x,y,vis)+1;
		int top = shortestPath(a,i-1,j,x,y,vis)+1;
		int bottom = shortestPath(a,i+1,j,x,y,vis)+1;
		
		// this line makes backtracking work. when the path is obtained (+1) we are again marking that node as false, so that it will be available for others left,right,top, bottom respectively.
		vis[i][j]=false;
		
		return Math.min(Math.min(left, right), Math.min(left, bottom));
		//
		
	}

}
