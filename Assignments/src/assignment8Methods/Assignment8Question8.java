package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question8 {

	public static void main(String[] args) {

		fib();
		

	}

		public static void fib() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the order of a fibonacchi number: ");
			int input=sc.nextInt();
			int n=input;
			
	sc.close();
	
			int x=0, y=1, z=0; //z=sum of previous two number
			 
			for (int i=1; i<n; i++) {	
				
				z=y+x;
				y=x;
				x=z;
			
			}
			
			System.out.println("Input : "+input);
			System.out.println("Output : "+z);
			
		}
	
}


/*Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers 
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... 
The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input : 2
Output : 1

Input : 9
Output : 21*/