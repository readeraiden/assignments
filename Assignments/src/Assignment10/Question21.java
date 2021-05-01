package Assignment10;

public class Question21 {

	public static void main(String[] args) {

		String str="abXYabc";
		str=str.trim();
		int n=2;
		int count=0;
		
		for (int i=0;i<str.length()-(n-1);i++) {
			
			if (str.substring(i,i+n).equals(str.substring(0,n))) {
				count++;
			}
		}
		if (count>1) {
			System.out.println(true);
			System.out.println(str.substring(0,n)+" appears "+count+" times");
		}else {
			System.out.println(false);
			System.out.println(str.substring(0,n)+" appears once only");
		}
	
	}

}

/* Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().

Sample Output:

     input: abXYabc
     input: 1
     output: true
     a appears twice

     input: abXYabc
     input: 2
     output: true
     ab appears twice

     input: abXYabc
     input: 3
     output: false
     abX appears once only */
