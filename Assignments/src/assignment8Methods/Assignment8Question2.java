package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question2 {

	public static void main(String[] args) {

		cube();

	}

	public static void cube() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("input: ");
		int input=sc.nextInt();
		sc.close();
		int output=input*input*input;
		System.out.println("output: "+output);
		
	}
	
	

}


/*Create a method called cube. Write all required code inside this method 
 * in order to ask the user for a number and then prints the cubed value of that number:
 

Example:

input: 5
output: 125*/