package intro;

public class helloWorld {
 
	public static void main( String[] gs) {
		System.out.println("Hellowrold");
		
		// post and past increment
		 int b = 45 ;
		 int d = b++;   // b value is assigned to d and then b value is incremented, so d =45 and b =46 here
		 System.out.print(d+ " "+ b); 
		 System.out.println();
		 
		 
		 int a = 45 ;
		 int c = ++a; // a value will  be first incremented and then will be assigned to c, so c = 46 and b = 45 here
		 System.out.print(c+ " "+ a);
		 System.out.println();
		 
		 // TypeCasting
//		 Automatic TC byte->short->char->int->long->float->double   ...
//		 going reverse will be Manual TC.
		 
		 byte x = 4;
		 int y = x;
		 System.out.println(y); // it should print 4 without errors. since it is following the above series.
		 
//		 double l = 3.14;
//		 int m = l;   // this will give the error since not following the above series and had to do the manual TC.
//		System.out.println(y);

		// doing the manual TC...
		 double p = 3.14;
		 int q = (int)p ;   
		 System.out.println(q); // it should print 3.
	}
}
