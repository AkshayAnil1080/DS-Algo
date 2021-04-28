package strings;

public class StringSubsequenceOfAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1 = "GEEKSFORGEEKS";
	String s2 = "GRGES";
	System.out.println(fun(s1, s2, s1.length(), s2.length()));
	System.out.println(funr(s1, s2, s1.length(), s2.length()));
	}
	static boolean fun( String s1, String s2, int n , int m)   // itreative TC : O(n+m)
	 {
		 if(n<m) return false;
		 
		 int j= 0; 
		 for( int i =0 ; i<n && j<m ;i++)
		 {
			 if(s1.charAt(i) == s2.charAt(j))
				 j++;
		 }
		 return( j==m);
	 }
	
	static boolean funr( String s1, String s2, int n , int m) // recursive
	
	{
		if(m==0) return true;
		if(n==0) return false;
		
		if(s1.charAt(n-1) == s2.charAt(m-1))
			return funr(s1,s2, n-1,m-1);
					
			else
				return funr(s1,s2,n-1,m-1);
	}

}
