package intro;
import java.util.*;
public class inputAStringAfterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String str = sc.nextLine();
//		
//		System.out.println(num);
//		System.out.println(str);
		
		// by the above program you will not be able to take input the string from the next line. 
		// u input 5 and enter and the num will be printed..
		
		// what is happening ?
		// after inputting 5  when i press enter, it generetes a spcae character which gets input by the above str scanner.
		// so i need to add one more sc.nextLine() between num and str.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		System.out.println(num);
		System.out.println(str);
		
	}

}
