package encapsulations;

public class Student {
// every student has data, here its age and name
	
//	int age;
//	String name;
	// i want to have some conditions on name and age
	
	private int age;
	private String name;
	
	public int getAge()
	{
		//age =56
		return age;
	}
	
	public void setAge(int age)
	{
		if(age>20)
		{
			System.out.println("u are too old to be a student");
		}
		else
		this.age =age;
		
	}
//right click->source->genarate getter and setter 
}
