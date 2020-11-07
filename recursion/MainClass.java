package recursion;

public class MainClass {
static int stepCount  = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(sum(16));
		
//		System.out.println(pow(3,10000));
//		System.out.println("steps" + stepCount);
//		
//		stepCount = 0 ;
//		System.out.println(fastpow(3,10000));
//		System.out.println("steps" + stepCount);
		
		System.out.println(path(200 ,1));
		System.out.println(path(4 ,4));

	}

	
	static int sum(int n)
	{ // base case then recursive call;
		if(n==1)
			return 1;
		else
			return n+sum(n-1);
	}
	
	static int pow( int a , int b)
	{ 
		stepCount++;  // if b is 10,000: stepcount will be 10000. ans output comes in negative: Overflow
		if(b==0)
			return 1;
		else
			return a* pow(a,b-1);
	}
	// recommended.
	static int fastpow( int a, int b)
	{
		System.out.println(b);     // here stepcount 19 for same b=10000. tc= logn
		stepCount++;
		if(b==0)
			return 1;
		if(b%2==0)
			return fastpow(a*a , b/2);
		else 
			return fastpow(a,b-1);
	}
	static int path(int n, int m)
	{
		if(n==1 || m==1) return 1;
		
		return path(n,m-1) + path(m,n-1);
	}
}
