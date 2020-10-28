package methods;

public class JavaIsAlwaysPassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=34;
		int d=12;
		
		swap(c,d);
		System.out.println(c + " "+ d);
		//System.out.println(a + " "+ b); will give error here as scope of a and b is not here.
	}

	static void swap(int a , int b)
	{
		int temp=a; a=b; b=temp;
		System.out.println(a + " "+ b);
	}
}
