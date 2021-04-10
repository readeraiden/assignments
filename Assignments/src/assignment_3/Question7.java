package assignment_3;

/* Write a program that determines the change to be dispensed from a vending machine. 
   An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments 
   (25, 30, 35, . . . , 90, 95, or 100), 
   and the machine accepts only a single dollar bill to pay for the item.

      Sample output

      Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles */

public class Question7 {

	public static void main(String[] args) {
		int priceInCents=95;
		int change=100-priceInCents;
		int changeInQuarter=(change)/25;
		int changeInDime=(change%25)/10;
		int changeInNickle=(change%10)/5;
		//int changeInCent= change%5;
		System.out.println("Your change is " + changeInQuarter + " quarters, " + changeInDime + " dimes, and " + changeInNickle + " nickles");

	}

}
