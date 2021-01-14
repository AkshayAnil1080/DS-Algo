//		 TC :  O(n)  SC : constant => always usng an array size of 256

package strings;

//test case
//12544(#$!
//15$!4(42#

import java.util.Scanner;

public class anagramsWithAsciiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		String a =sc.nextLine();
		 String b = sc.nextLine();
		 int i,j =0;
		 int al[] = new int [256];
		 boolean isAnagram =true;

		for ( char c : a.toCharArray())
		{
			int index = (int) c;
			al[index] ++;
			
		}
		for ( char s : b.toCharArray())
		{
			int index = (int) s;
			al[index]--;
			
		}
		
		for(i=0 ; i<256 ; i++)  // checkin if each element in array is equal to zero...if one of the element existe not equal to zero , not anagram
		{
			if(al[i] != 0)
			{
				isAnagram =  false;
				break;
			}
		}
		if(isAnagram)
			System.out.println("Strings are anagrams");
		else
			System.out.println("Strings are not anagrams");
		
					
	}

}
