package Lab2;

import java.util.Scanner;

public class Lab2_Q1_Edited {

	public static void main(String[] args) {
		
		int x,y;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Enter your first number:");
		int num=sc.nextInt();
		int small=num, largest=num;
		//boolean i=true;
		sc.close();
		while (true) {
			System.out.print("Enter your next number:");
			int num1=sc.nextInt();
			
			if(small>num1) {
				small=num1;
				
			}else if (largest<num1){
				largest=num1;
				}
			
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
				int num2=sc.nextInt();	
				sc.close();
				if(num2<0||num2>1) {
					do {
					System.out.println("Invalid Input, please select 0 or 1");
					int num3=sc.nextInt();
					if (num3==0||num3==1) {
						y=num3;
						break;
					}
					else 
						x=num3;
				
					} while(x!=0||x!=1);
					
					//int num2=y;		
				}
				if (num2==0)
			
				break;
				
				//continue;	
				
				//System.out.println("Do you want to enter another number: 0-No, 1-Yes");
				//int num2=sc.nextInt();
				//continue;
			}
	

		System.out.println("Smallest number is:" + small);
		
	    System.out.println("Largest number is:" + largest);

	}

}
