package Lab2;

import java.util.Scanner;

public class Lab2Question5 {

	public static void main(String[] args) {

		Scanner meal = new Scanner(System.in);
		
		System.out.print("Enter the charge of the meal=");
		double chargeOfMeal=meal.nextDouble();
		
		double tax= chargeOfMeal*6.75/100;
		double tip= (chargeOfMeal+tax)*0.2;
		double total=chargeOfMeal+tax+tip;
		
		System.out.println("Charge of the Meal is=" + chargeOfMeal);
		System.out.println("Amount of tax is=" + tax);
		System.out.println("Amount of tip is=" + tip);
		System.out.println("Total amount of the bill is=" + total);

	}

}

/*Write a program that computes the tax and tip on a restaurant bill. 
 * The program should ask the user to enter the charge for the meal. 
 * The tax should be 6.75 percent of the meal charge. 
 * The tip should be 20 percent of the total after adding tax. 
 * Display the meal charge, tax amount, tip amount, and total bill on the screen.*/
