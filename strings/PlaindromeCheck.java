package strings;

public class PlaindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str =  "geeks";    
		String str =  "ABCDCBA";
		System.out.println(fun(str, str.length()));
		System.out.println(naiveM1(str));
	}
	// effM1 - TC : O(n) -ASC: O(1)
	static boolean fun(String str, int n)
	{
		int i = 0 ;
		int j = n-1;
		
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
				return false;
			
			else 
			{
				i++;
				j--;
			}
		}
		return true;
	}
	// Naive TC : O(n) ASC :O(n)
	static boolean naiveM1(String str)
	{
		StringBuilder rev  = new  StringBuilder(str);
		
		rev.reverse();
		
		return str.equals(rev.toString());
	}

}
