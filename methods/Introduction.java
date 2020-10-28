package methods;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=23, b=50;
		int result= maxOf(a,b);
		System.out.println(result);
		
		System.out.println(maxOf(1000 , 200045));
		sayHi();
	}
	
	static int maxOf(int a , int b)
	{
		return a>b ? a:b;
	}
	//there can be as many functions indide a class.
	static void sayHi()
	{
		System.out.println("Have a good day");
	}

}
