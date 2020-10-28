package oops.packages;

//import java.util.Scanner;
//instead access all the file in java.util
import java.util.*;

//import oops.packages.models.Student;
//import oops.packages.models.Teacher;
//instead just import the whole package.
import oops.packages.models.*;

public class MainClass {

	public static void main(String[] args) {
	
//how to access student class here of package models 
		Student obj = new Student("Tom"); //import line 3

		obj.name="Jerry"; //represent error as name is declared as priavte.
		obj.getPassword();//again error as getPasswrod is prvate. make it public, it will work.
		
		myDefault ob1 = new myDefault();// error as this is the default modifier. make it public,it works.
		
		
		
		//now want to access Teacher class 
// //creating ob for class Teacher and the importing the class here		
		Teacher teacher =new Teacher();
		
		Scanner sc = new Scanner(System.in);
	}
}
