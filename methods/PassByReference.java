package methods;

class Dog
{
	int legs;
}

public class PassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating object
		Dog c = new Dof();
		c.legs = 4;
		Dog d = new Dog();
		d.legs = 3;
		
		swap(c,d);
		System.out.println(c.legs + " " + d.legs);
	}
	
	static void swap(Dog a, Dog b)
	{
		Dog temp = a;
		a = b;
		b = temp;
	}
	
}
