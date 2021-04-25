package VectorsAndStacks;

import java.util.ArrayList;


//TC :  O(1) -  Amortized (on Avg)
class alStack
{
	ArrayList<Integer> al = new ArrayList<>();
	void push(int x)
	{
		al.add(x);
	}
	
	int pop()
	{
		if(al.isEmpty()) return -1;
		
		int res =  al.get(al.size()-1);
		al.remove(al.size()-1);
		
		return res;
	}
	int peek()
	{
		return al.get(al.size()-1);
	}
	
	boolean isEmpty()
	{
		return al.isEmpty();
	}
	int size()
	{
		return al.size();
	}
}
public class StackwithArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				alStack st = new alStack();
				
				st.push(10);
				st.push(20);
				System.out.println(st.pop());
				st.push(20);
	}

}
