package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question13 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Water Consumption: ");
		double x=sc.nextDouble();
		System.out.println("Water Tax is: "+waterTax(x));
	sc.close();	
		
		//System.out.println("Your Total Water Bill is: "+ waterBill(x));

	}

		public static double waterBill(double x) {
			double bill=x+waterTax(x);
			
			return bill;
		}
	
				public static double waterTax(double y) {
					double tax=0;
					if (y<=50)
						tax=y*0.6;
					if (y>50 && y<=100)
						tax=y*0.9;
					if (y>100 && y<=150)
						tax=y*0.9+50;
					if (y>150)
						tax=y*0.9+100;
					
					return tax;
					
				}
	
}






/* This method calculates a water bill, the method gets a double and returns a double.

The more water you use the more it will cost you (as a fine for wasting water).

for example:

waterTax(50)
returns 30

waterTax(55)
returns 49.5

waterTax(101)
returns 140.9

waterTax(151)
returns 235.9

the regular calculation under 50 is
bill = units * 0.60;
above 50 is:
bill = units * 0.90;

above 100 the calculation is like above 50 but with a 50 as fine

and above 150 it is the same as above 50 (units *0.90) but with a 100 fine added to the price. */