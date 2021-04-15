package Lab2;

import java.util.Scanner;

public class Lab2Question1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		
			System.out.print("Enter your first number:");
			int num=sc.nextInt();
			int small=num, largest=num;
			boolean i=true;
			while (i) {
				System.out.print("Enter your next number:");
				int num1=sc.nextInt();
				
				if(small>num1) {
					small=num1;
					
				}else if (largest<num1){
					largest=num1;
				}
				
				System.out.print("Do you want to enter another number: 0-No, 1-Yes");
				int num2=sc.nextInt();
				if (num2==0)
					i=false;
						
			}
			

			System.out.println("Smallest number is:" + small);
			
		    System.out.println("Largest number is:" + largest);
		
		
		
		
		
		
	}

}

/* Write a program with a loop that lets the user enter a series of integer numbers. 
   After all the numbers have been entered, the program should display 
   the largest and smallest numbers entered.*/