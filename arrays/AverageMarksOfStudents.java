package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
				System.out.println("enter the number of students : ");
		int n= sc.nextInt();
		System.out.println("enter the marks");
		int[] marks = new int[n];
		
				for(int i=0;i<n;i++)
				{
					marks[i]=sc.nextInt();
				}
		int average=0;
		for(int i=0;i<n;i++)
		{
			average=average+marks[i];
		}
		average=average/n;
		System.out.println(average);
	
	}

}
