package intro;

public class rightAndLeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a = 13;
		 int b = a >>1;  // >> => rightshift , technically divide by 2^1 in decimal number
		 int c = a >>2 ; // division by 2 ^ 2
		 int m = a >>3;  //division by 2 ^ 3
		 int d = a <<1;  // << => leftshift , technically multiply by 2^1
		 int e = a <<2 ;  // multiply by 2 ^ 2
		 
		
		 System.out.println(b +" " + c +" "+m+ " "+ d + " "+ e);
		 
		 
		 // right shift by x => /2^x in decimal form or , eliminate the last x bits from binary form
		 // left shift by x => *2^x in decimal form or , append x bits zero to binary form 
	}

}
