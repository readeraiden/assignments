package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question7 {

	public static void main(String[] args) {

		isPalindrome();

	}

		public static void isPalindrome() {
			
			Scanner number = new Scanner(System.in);
			
			System.out.println("Enter a 4 digit Integer number: ");
			int num=number.nextInt();	//Palindrome can be either; abba or aaaa
			System.out.println("input: "+num);
number.close();

			int x=(num/100);			//Finding First 2 digit, ba or aa
			//System.out.println(x);
			
			int y= (num%100);			//Finding Last 2 digit, ab or aa
			//System.out.println(y);
			
			int differ=(x-y)%9; 		//Difference always must be zero for aaaa or multiple of 9 for abba
										//ab-ba= either 9 or -9, or multiple of 9, and aa-aa=0
			//System.out.println(differ);
			
			if (differ==0) {
			System.out.print("output: ");
			System.out.println(true);
			
			}else if(differ!=0){
			System.out.print("output: ");
			System.out.println(false);
			}
		
		}
}


/*Complete a method isPalindrome() that will check if the number is a palindrome. 
  Print your result as a boolean (true or false).
 
Do not convert int into a string!
Example:
input: 1001
output: true
4554
Example:
input: 1234
output: false*/