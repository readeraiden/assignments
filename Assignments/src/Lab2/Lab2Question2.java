package Lab2;

import java.util.Scanner;

public class Lab2Question2 {

	public static void main(String[] args) {
		
		Scanner calorie = new Scanner(System.in);
		
		int colorieOfCookie=300/4;
		
		
		System.out.print("How many cookies have you eaten?=");
		int numberOfCookie = calorie.nextInt();
		calorie.close();
		System.out.println("Total colories consumed= " + (numberOfCookie*colorieOfCookie) );
	}
		
}


/*A bag of cookies holds 40 cookies. The calorie information on the bag claims that 
 there are 10 serving in the bag and that a serving equals 300 calories. 
 write a program that lets the user enter the number of cookies 
 he or she actually ate and then reports the number of total calories consumed.*/
