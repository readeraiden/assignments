package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number bigger than Zero: ");
		int x =sc.nextInt();
	sc.close();	
		boolean y=isEven(x);
		
		System.out.println(y);

	}

		public static boolean isEven(int x) {
			
			if (x%2==0)
				return true;
			else		
				return false;
					
			
		}
	
}


/*isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true*/