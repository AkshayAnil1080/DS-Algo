package strings;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aab";
		String b = "abc ";
		boolean isAnagram=false;
		boolean visited[] =new boolean[b.length()]; // by default value is false
				
	    if(a.length() == b.length())
	    {
	    	
	    
			for(int i=0 ;  i<a.length(); i++)
			{
				isAnagram=false;
				char c= a.charAt(i);
				for(int j =0; j<b.length();j++)
				{
					if(b.charAt(j) == c && !visited[j]) //  if c== b(0) and visited[0] == false which is false by default.then make visited[0] = true. 
					{
						visited[j]= true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram)
				{
					break;
				}
				
		}
	    }
		if(isAnagram)
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("not anagram");
		}

	}

}
