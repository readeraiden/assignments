package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question5 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Input an Integer Number:");
		int x=num.nextInt();
		sign (x);
		num.close();
	}

		public static void sign(int x) {
			int y;
			if (x<0)
				y=-1;
			else if(x==0)
				y=0;
			else
				y=1;
		//return y;
			System.out.println(y);
		}
		
}

/*Create a method called sign.  
 * It gets a number and tells you if its positive, negative or zero.
 

for example :
sign(5) => 1
sign(-30)=> -1
sign(0) => 0

sign gets an int parameter.

print out 1,-1 or 0 depending on the input

the parameter should be entered by user (create a scanner object)*/