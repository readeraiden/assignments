package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question1 {

	public static void main(String[] args) {
		plus();
		
	}
		public static void plus() {
			Scanner scan = new Scanner(System.in);
					
		System.out.println("enter first number:");
		int num1=scan.nextInt();
		
		System.out.println("enter second number:");
		int num2=scan.nextInt();
		
		int result=num1+num2;
		System.out.println("result is: "+result);
		scan.close();
		}
		
}

/*Create a method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within the plus method.

Example:

enter first number:
1
enter second number:
2
result: 3*/
