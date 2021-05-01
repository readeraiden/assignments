package Assignment10;

public class Question20 {

	public static void main(String[] args) {

		int n= 5;
		int factor=1;
		
		if (n<0) {
			System.out.println("Enter a positive Integer");
		}else {
			
			for (int i=n;i>=1;i--) {
				
				factor*=i;
			}
			
		}
		System.out.println(factor);
	}
}


/*In mathematics, the factorial of a positive integer n, denoted by n!,  is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.

Sample Output:

     input: 5
     output: 120
*/