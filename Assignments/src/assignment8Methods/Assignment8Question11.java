package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question11 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter buying price: ");
		int buyPrice=sc.nextInt();
		System.out.println("Enter selling price: ");
		int sellPrice=sc.nextInt();
	sc.close();	
		System.out.println("returns: "+ c_profits(buyPrice,sellPrice));
	}	
	
				public static String c_profits(int a, int b) {
						String str;
						if (a<b) {
								str="profit";
		
						} else if (a>b) {
								str="loss"; 
		
						} else {
								str="no loss";
				}
					return str;
	}
	
				
}


/*c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"*/