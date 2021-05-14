package Trie;



public class TrieSearchInsertDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "bad", "bat" , "geeks" , "cat" , "cut" };
		
		
		root =  new TrieNode();
		for( int i =0  ; i <str.length ;i++)
			insert(str[i]);
		
		delete(root,"bat" ,0);
		
		if(Search("bad") == true)
			System.out.println("bad : " +"Yes");
		else System.out.println("bad : " +"No");
		
		
		if(Search("bat") == true)
			System.out.println("bat : " +"Yes");
		else System.out.println("bat : " +"No");
	}
	
	static class TrieNode
	{
		TrieNode child[] =  new TrieNode[26];
		boolean isEnd;
	
	}
	static TrieNode root;

	static boolean Search(String str)
	{
		TrieNode curr =  root;
		
		for( int i =0 ; i <str.length(); i++)   // O(n)
		{
			int index =  str.charAt(i) - 'a';
			if(curr.child[index] == null)
				return false;
			curr = curr.child[index];
		}
		return curr.isEnd;
	}

	static void insert(String str)
	{
		TrieNode curr =  root;
		
		for( int i =0 ; i <str.length(); i++) // O(n)

		{
			int index =  str.charAt(i) - 'a';   //		1. find index
			if(curr.child[index] == null)		//		2
				curr.child[index] = new TrieNode();
			
			curr =  curr.child[index];			//		3. update
		}
		//4 mark the last character node as T;
		curr.isEnd = true;
		
	}
	// traverse to every charater and make recursive call for every character
	// for every rec call some contant amount of work is performed
	// TC : O(N)
	static TrieNode delete( TrieNode root, String key, int i)
	{
		if(root ==null) return null;  // 1.
		if(i==key.length()) //2.
		{
			root.isEnd = false;
			if(isEmpty(root) == false) return null;
			return root;
			
		}
		//3.
		int index =  key.charAt(i) - 'a';
		root.child[index] = delete(root.child[index],key, i+1);
		
		if(isEmpty(root) && !root.isEnd) root = null;
		return root;
	
	}
	static boolean isEmpty(TrieNode root)
	{
		for (int i =0 ; i <26; i++)
			if(root.child[i]!=null)  // should not have any child
				return false;   // no child exists
		return true;
	}	

	

}
