package VectorsAndStacks;

// TC : O(1)
// Problems:  no dynamic resizing   - can use AL.
class arrStack
{
	int arr[] ; 
	int cap;
	int top;
	
	arrStack(int cap)
	{
		this.cap = cap;
		arr = new int[cap];
		top = -1;
	}
	
	void push( int x)
	{
		if(top == cap)
			return;
		top++;
		arr[top]=x;
	}
	
	int pop()
	{
		if(top == -1)
			return -1;
		int res =  arr[top];
		top--;
		
		return res;
	}
	int peek()
	{
		if(top == -1)
			return -1;
		int res =  arr[top];
		return res;
	}
	
	int size()
	{
		return top+1;
	}
	
	boolean isEmpty()
	{
		return (top==-1);
	}
}
public class StackUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap =5;
		arrStack st = new arrStack(cap);
		
		st.push(10);
		st.push(20);
		System.out.println(st.pop());
		st.push(20);
		
		
		
	}

}
