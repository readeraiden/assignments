package assignment8Methods;

import java.util.Random;

public class Assignment8Question12 {

	public static void main(String[] args) {
		
		Random bool = new Random();
		boolean bool1=bool.nextBoolean();		 
		boolean bool2=bool.nextBoolean();	
				
		boolean returns=hamletQuote(bool1,bool2);
		
		System.out.println("hamletQuote("+bool1+", "+bool2+")");
		System.out.println("returns "+returns);
		
	}
	
			public static boolean hamletQuote(boolean x,boolean y) {
				if (x==false && y==false) {
					return false;
				}else {
					
					return true;
				}
			}
	
}


/* The danish prince most famous quote is "to be or not to be". 
 thats a classic example of boolean logic.
 

the hamletQuote method only returns true if one of or both of the boolean parameters is true.

example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false

 

hint: use the truth table for this one, this can be done with one if and a logical operator.
*/