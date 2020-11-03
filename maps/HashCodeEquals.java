package maps;
//aim: to show why hascode and equals are override together. what is the contract?
import java.util.*;

// going to shop  to buy pen: blue , red
public class HashCodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen pen1 = new Pen(10 , "blue");
		Pen pen2  = new Pen(10 , "blue");
		
		System.out.println(pen1 == pen2);  // false:
		System.out.println(pen1.equals(pen2));  // false:
		//why? as  both has diff mem location.
		System.out.println(pen1);
		System.out.println(pen2);
		
// i want to diff: on colour and price not on the mem location.
// overiding the equals method and now line 12 returna true;
		
		
		Set<Pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		System.out.println(pens);
//but hashSet still defines them differently, we need to override hashcode method simultaneously with equals.
	}
}


class Pen
{
	int price;
	String color;
	
	public Pen( int price , String color)
	{
		this.price = price;
		this.color = color;
	}
	
//					@Override  /// in built in eclipse
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Pen other = (Pen) obj;
//		if (color == null) {
//			if (other.color != null)
//				return false;
//		} else if (!color.equals(other.color))
//			return false;
//		if (price != other.price)
//			return false;
//		return true;
//	}
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((color == null) ? 0 : color.hashCode());
//		result = prime * result + price;
//		return result;
//	}
	
	
	
	
}