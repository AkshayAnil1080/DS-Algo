//		 TC :  O(n^2)  SC : O(n) : using a boolean array

package strings;
import java.util.*;
public class anagramOfaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a =sc.nextLine();
		 String b = sc.nextLine();
		 int i,j =0;
		 boolean visited[] = new boolean[b.length()];
		 boolean isAnagram = false;
		 
		 
		 if(a.length() !=  b.length())
		 {
			 System.out.println("string are of different length, not Anagrams");
		 }
//		 TC :  O(n^2)  SC : O(n) : using a boolean array
		 for (i =0 ; i<a.length() ; i++)
		 {
			 isAnagram = false;
					 
					 for( j = 0 ;j<b.length() ; j++)
					 {
						 if (b.charAt(j) == a.charAt(i) && visited[j]==false)
						 {
							 visited[j] = true;
							 isAnagram = true;
							 break;
						 }
					 }
					 if(isAnagram == false)  // ie. at one point one of element in a was not found in b, break the ith loop , no need to check further. // and print it is anagram for true else not.
						 break;
		 }   
		 if(isAnagram)
			 System.out.println("it is anagram");
		 else
			 System.out.println("not anagram");
 
	}

}
