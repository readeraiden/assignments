package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X number to be tested: ");
		int x = sc.nextInt();
		System.out.println("Enter the max number to be compared against: ");
		int y = sc.nextInt();
	sc.close();				
		System.out.println("returns "+ max(x,y));
	}
		public static int max(int x, int y) {
			int rtrn=0;
			if (x > y) {
			rtrn= y;
			}else {
			rtrn=x;
			}
			return rtrn;
		}
}

/*Create a method called max. It gets two ints, x and max.
x is the test case, max is what we test against.

if x is bigger then max return max
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5*/