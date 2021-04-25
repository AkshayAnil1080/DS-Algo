package VectorsAndStacks;


 class Node1
{
	int data;
	Node1 next;
	Node1(int data) 
	{
		this.data = data;
		next = null;
	}
}
class llStack
{
	Node1 head;
	int size;   // maintaining a size to make this method TC:  O(1)
	
	llStack()   // constructor call t
	{
		head = null; size = 0;
	}
	void push(int x)    // insertion at head of ll.  O(1)
	{
		Node1 temp = new Node1(x);
		temp.next=  head;
		head= temp;
		size++;
	}
	
	int pop()
	{
		if(head==null) return -1;
		
		Node1 temp =  head;
		head = head.next;
		
		return temp.data;
	}
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return (head==null);
	}
	int peek() {
		if(head == null) return -1;
		
		Node1 temp =  head;
		return temp.data;
	}
}


public class StackUsingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llStack st=  new  llStack();
		 st.push(10);
			st.push(20);
			System.out.println(st.pop());
			st.push(20);
	}

}
