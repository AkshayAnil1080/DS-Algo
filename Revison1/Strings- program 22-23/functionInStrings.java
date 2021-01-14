package strings;

public class functionInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 StringPool area v/s Heap area
		
		String name="akshay";
		String name1 ="akshay";
	    String anotherName = new String("akshay");
	 
	    System.out.println(name==name1);  // string pool area   returns true
	    System.out.println(name==anotherName); // string pool v/s heap area    return false
	
	 
	    // but if u want to just check the value
	    System.out.println(name.equals(anotherName));  												// return true
		
	    
	    String str = "java programming";
	    	
	    System.out.println(str.charAt(0)); 				//1. access via index  -- chartAt(i) // "j"
	    System.out.println(str.length());   			 //2. length() // 16
	    
	    //3. find the substring  // substring(int beginIndex)   // substring( int beginIndex , int endIndex)
	    System.out.println(str.substring(1,4));  	 												// "ava"
	    System.out.println(str.substring(4));    		 											// " programming"
	    
	    //4. contains  - if given string is a part of substring -- boolean type
	   System.out.println(str.contains("java"));
	   
	   //5. equals - line 19
	   
	   //6. isEmpty()
	   System.out.println(str.isEmpty());   														// false
	   
	   //7. concat
	   System.out.println(str.concat(" and DS algo"));
	   
	   //8 replace(old char , new char) 
	  System.out.println(str.replace('a','o'));  												//jovo progromming
	  
	  
	  //9. indexOf('ch')
	  System.out.println(str.indexOf('a'));  // returns for the first occurance
	  
	  //10. toLowerCase()  and  toUpperCase()
	  System.out.println(str.toLowerCase());  													//java programming
	  System.out.println(str.toUpperCase());													//JAVA PROGRAMMING

	  //11. String a[] =  str.split("exp") ;             -     split the string based on exp = > returns array of Strings so have to store in array
	  String str1 = "java,programmingand,DS,AlGO";
	  String a[] = str1.split(",");
	  //print
	  System.out.println(a[0]);
	  for(String s :a)
		  System.out.print(s+ " ");
	  
	  
	  //12. trim() : remove back and forth spaces
	  String str2 = "              java programming and DS Algo              ";
	  System.out.println(str2.trim());   														// "java programming and DS Algo"
	  
	 //13. toCharArray   -- converts characters of String into Array , return type - array
	  
	  String str4 = "cow";
		char m[] = str4.toCharArray();
		System.out.println(m[0]);	
		
		
		
		
	  
	  		
	}

}
