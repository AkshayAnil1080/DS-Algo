package intro;

public class greatestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a  = 10;
 int  b = 15;
 int c = 25;
 int result = a>b ? a>c ? a:c : b>c ? b:c ;
 System.out.println(result);
	}
// explanation:
//	[ a>b ? (exp1)a>c ? a:c) : (exp2)b>c ? b:c) ]....
	
}
