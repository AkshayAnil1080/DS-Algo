package oops.packages.models;

public class Student {
	private String name; //name of the student
	
	public Student(String name) { //constructor
		this.name = name;
	}
	public String getName() { // function
		getPassword(); // here no error as private mem is getting accessed within class.
		return name;
	}

	
	private String getPassword() {
		return "kadskn@123";
	}
	
	//default: is restricted to his own package
	String myDefalut() // i m a file(class) present in folder(packages). Only other files(class) in my folder can access me.
	{
		return "i will be only be accessed within my package like Teacher class";
	}
}
