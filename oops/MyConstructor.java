package oops;

//similar to method: defined inside a class (obv)
//no return type
//same name as class
//call automatically when obj is created.
//public class MyConstructor {
//	
//	MyConstructor(){
//		System.out.println("is called as object created");
//	}
//	
//	 
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		MyConstructor obj = new MyConstructor();
//		
//	}
//
//}

//											NoArgConst
//constructor that does not accepts any parameters.

//class Test
//{
//	int a;
//	Test()   //  see no parameters are passed
//	{
//		a=5;
//		System.out.println(a);
//	}
//}
//
//class Vehicle{
//	int wheels;
//	
//	Vehicle()
//	{
//		wheels=4;
//	}
//}
//public class MyConstructor{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Test obj = new Test();
//		
//		
//		Vehicle car = new Vehicle();
//		System.out.println("car1 wheels " + car.wheels);
//	}
//
//}


// 									Defalut const
//java creates a default cons with value
//int=0, float=0.0, double=0000, boolean=false;..
//u can also create it by initializing to zero. its up to you
//
//class My{
//	int wheels;
//	
//	My()
//	{
//		wheels=0;
//	}
//	
//}
//public class MyConstructor{
//
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		My car = new My();
//		System.out.println("car.wheels= " + car.wheels);
//		
//	}
//
//}

//						parameterized cons
//same as method overloading.
//class Vehicle{
//	int wheels;
//	int headLight;
//	
//	Vehicle(int noOfWheels)
//	{
//		noOfWheels=wheels;
//		headLight=2;
//		
//	}
//}
//public class MyConstructor{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Vehicle car =  new Vehicle(4);
//		Vehicle truck =  new Vehicle(8);
//		
//		System.out.println("car wheels " + car.wheels+" and headlight " + car.headLight);
//		System.out.println("truck wheels " + truck.wheels+" and headlight " + truck.headLight);
//	}
//}

//						const overloading
class Vehicle
{
	int wheels; int headLight; String color;
	
	Vehicle(int wheels)
	{
		this.wheels=wheels; headLight=2;
	}
	
	Vehicle(int wheels, String color)
	{
		this.wheels=wheels; this.color=color;
	}
}
public class MyConstructor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Vehicle(2);
		Vehicle erickshaw = new Vehicle(3, "Yellow");
	
		System.out.println(erickshaw.wheels+" wheels and color " + erickshaw.color);
	}
}

//// 		Interview: after making a cons of a class, can u call a default const for the same class.
//// NO.
//but if u still want to.
//line 133 Vehicle random = new Vehicle();// this will give error but if make default const then it will not.
//Like:  Vehicel() {}  in class Vehicle
//	