package strings;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="akshay";
		String name1 ="akshay";
	 String anotherName = new String("akshay");
	 
	 System.out.println(name==name1);  // string pool area
	 System.out.println(name==anotherName); // string pool v/s heap area
	
	 
	 // but if u want to just check the value
	 System.out.println(name.equals(anotherName));
	
	 
	 
	 String card ="coder boy akshay";
	System.out.println(card.charAt(0)); //c
	
	System.out.println(card.length()); //16	
	System.out.println(card.substring(5)); //" boy akshay"
	
	System.out.println(card.substring(2, 6));//b
				
	System.out.println(card.contains("boy")); //search a character
	
	System.out.println(card.isEmpty()); //false
	
	System.out.println(card.substring(5).toUpperCase());
	
	//concat via + and concat.
	 card= card + " here";
	System.out.println(card);
	System.out.println(card.concat(" yay!")); // works just for this instant
	
	
	//replace
	System.out.println(card.replace('y' , 't')); // since strings are immutabl, but we are getting alwaysa new one. and all the old ones are still there in memory
	//split: to split around a certain group of characters
	String cars = "Hyundai,Maruti,Swift, Wagonr,Ferrrari,Lamborgini";
	String allCars[] = cars.split(",");
	for(String car: allCars)
	{
		System.out.print(car+" ");
	}
	System.out.println();
	//retrn the position of first encountered character.if not found it returns "-1"
	System.out.println(card.indexOf('o'));
	
	System.out.println(card.toUpperCase());
	System.out.println(card.toLowerCase());
	
	//trim: remves all the back and froth spaces
	String myname="     romeo    ";
	System.out.println( myname.trim());
	

	
	}

}
