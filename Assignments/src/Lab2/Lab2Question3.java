package Lab2;

import java.util.Scanner;

public class Lab2Question3 {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
			
		int sum=0;
		
		while(true){
			System.out.print("Enter a number=");
			int num=number.nextInt();
			if (num>0)
			sum=sum+num;
			else 
				break;
			
		}
		number.close();
		System.out.println("Sum of the numbers which has been entered=" + sum);
	}

}


/*Write a program that asks the user for a positive nonzero integer value. 
 The program should use a loop to get the sum of all the integers from 1 up to the number entered.
 */