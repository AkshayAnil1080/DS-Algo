package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new  Scanner(System.in);
		System.out.println(" enter dimension : ");
		int rows= sc.nextInt();
		int col= sc.nextInt();
		
		 int a[][]= new int[rows][col];
		 int b[][]= new int[rows][col];
		 int c[][]= new int[rows][col];
		 
		 System.out.println(" enter array a ");
		 for(int i=0;i<rows ; i++) {
			 for(int j=0; j<col; j++) {
				 a[i][j] =  sc.nextInt();
			 }
		 }
		 
		 System.out.println(" enter array b ");
		 for(int i=0; i<rows ; i++) {
			 for(int j=0; j<col; j++) {
				 b[i][j] =  sc.nextInt();
			 }
			 
		 }
	
		 for(int i=0; i<rows ; i++) {
			 for(int j=0; j<col; j++) {
				 c[i][j] =  a[i][j]+b[i][j];
			 }
		 }
		 
		 for(int i=0; i<rows ; i++) {
			 for(int j=0; j<col; j++) {
				 System.out.print(c[i][j]+ " ");
			 }
			 System.out.println();
		 }
		
	}
}
