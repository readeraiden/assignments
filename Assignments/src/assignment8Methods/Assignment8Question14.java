package assignment8Methods;

import java.util.Random;

public class Assignment8Question14 {

	public static void main(String[] args) {

		Random rnd = new Random();
		boolean x=rnd.nextBoolean();
		System.out.println("a "+x);
		boolean y=rnd.nextBoolean();
		System.out.println("b "+y);
		boolean z=rnd.nextBoolean();
		System.out.println("c "+z);
	
		System.out.println("returns: "+threeLocks(x,y,z));

	}

			public static boolean threeLocks(boolean a, boolean b, boolean c) {
				 
				if ((a==true && b==true) || c==true)
				
					return true;
				else
					return false;
			}
	
}


/*This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table (Harici bir siteye bağlantılar.)*/