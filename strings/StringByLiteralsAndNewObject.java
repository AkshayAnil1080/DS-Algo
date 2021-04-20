package strings;

public class StringByLiteralsAndNewObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=  "geeks";  // by literals ; creates in string pool area.
		String s2= "geeks";		// by literals ; creates in string pool area,if already present just points the reference to it.
		
		if(s1==s2)   // compares whether two references refer to the same object or not.  // Yes  // s1-> geeks <- s2 
			System.out.println("Yes");
		else
			System.out.println("No");
		
//		String s2  = new String("geeks"); // will give error  //. duplicate local variables
  				String s3 = new String("geeks");  // by new Object -  creates both in String pool and Heap Area
  		
  				
  		if(s1==s3)   // NO            s1-> geeks <- s2    || s3-> geeks
  			System.out.println("Yes");
  		else
  			System.out.println("No");
	}

}


//What is String pool area
//Since same string is being used many times, jave developer created a new place in memory " String pool area".
//Sytntax: String s1= "geeks"  ; so geeks is created for the first time in SPA.
// String s2 =  "geeks" ; now next time created again for geeks, s2 just points to the alredy present "geeks" - JAVA Memory Optimization.
