package Lab2;

import java.util.Scanner;

public class Lab2Question6 {

	public static void main(String[] args) {
		Scanner sales = new Scanner(System.in);
		
		System.out.print("Enter the amount of sale=");
		double sale =sales.nextDouble();
		sales.close();
		double stateTax= sale*0.04;
		double countryTax= sale*0.02;
		double totalTax=(stateTax+countryTax);
		
		System.out.println("The amount of the purchase is=" + sale);
		System.out.println("The state sales tax is=" + stateTax);
		System.out.println("The country sales tax is=" + countryTax);
		System.out.println("The total sales tax is=" + totalTax);
		System.out.println("The total amount of the sale is=" + (sale+totalTax));
		
		

	}

}

/*Write a program that will ask the user to enter the amount of a purchase. 
 * The program should then compute the state and county tax sales tax. 
 * Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
 * The program should display the amount of the purchase , 
 * the state sales tax, 
 * the county sales tax, 
 * the total sales tax, 
 and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)*/