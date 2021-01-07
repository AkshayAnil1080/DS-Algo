package intro;

import java.util.*;

public class calculateSi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		float R = sc.nextFloat();  // if want to initialize append a f at last => eg rate =12.1f;
		int time = sc.nextInt();
		
		float simpleInterest = P*R*time/100;
		
		System.out.println("the simple intertst is " + simpleInterest);
		
	}

}
