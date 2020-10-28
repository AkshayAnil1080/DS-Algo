 package oops;
 // class to be declared outside main.
 // obj inside main

 class Cat{
	 boolean hasFur;
	 String colour,breed;
	 int legs, eyes;
	 
	 public void walk()
	 {
		 System.out.println("cat is walking");
	 }
	 public void eat() {
		 System.out.println("cat is eating");
	 }
	 public void description()
	 {
		 System.out.println("my cat has " + legs +" legs and " + eyes + " eyes");
	 }
 }
 class Dog{
	 String breed,name;
	 public void jump()
	 {
		 System.out.println("my dog "+name+" is jumping");
	 }
	public void description() 
	{
		System.out.println("my dog breed is "+breed+" and name is "+name);
		// TODO Auto-generated method stub
		
	}
	 
 }
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Cat cat1 =new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.walk();
//		cat2.eat();
//		
//		cat1.legs = 3;
//		cat1.eyes = 2;
//		
//		cat2.legs = 4;
//		cat2.eyes = 1;
//		
//		cat1.description();
//		cat2.description();
		Dog husky = new Dog();
		Dog kira = new Dog();
		
		husky.breed= "husky";
		husky.name = "lovely";
		
		kira.breed =  "labra";
		kira.name= "rocky";
		
		husky.jump(); kira.jump();
		
		husky.description();
		kira.description();
	}

}
