package intro;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true){
			
		System.out.println("Enter two Numbers");
		int a  = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter Operations + , - , / or *....");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		switch (operation)
		{
		case '+':
			result = a+b ; break;
		case '-':
			result = a-b ; break;
		case '/':
			result = a/b ; break;
		case '*':
		result = a*b; break;
		}
		System.out.println(result);
	}
	}

}
