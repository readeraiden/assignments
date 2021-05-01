package Assignment10;

public class Question19 {
	
	public static void main(String[] args) {
		
		//String str = "javaxjava";
		String str = "javaxjavaapplepearjavaegg";
		
		int count=0;
		
		for (int i=0;i<str.length()-3;i++) {
			
			if(str.substring(i,i+4).equals("java")) {
				count++;
			}
		}
		System.out.println(count);
	}
	


}


/*Return the number of times that the string "java" appears anywhere in the given string word.

Sample Output:

     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3*/