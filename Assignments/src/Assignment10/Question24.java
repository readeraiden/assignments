package Assignment10;

public class Question24 {

	public static void main(String[] args) {

		//String str="We study java not python";
		String str="What's the difference between java, javascript and python?";
		
		int count1=0;
		int count2=0;
		for (int i=0; i<str.length()-3;i++) {
			if (str.substring(i,i+4).equals("java")) {
				count1++;
			}
		}

		for (int i=0; i<str.length()-5;i++) {
			if (str.substring(i,i+6).equals("python")) {
				count2++;
			}
		}
		
		if (count1==count2)
			System.out.println(true);
		else
			System.out.println(false);
	}

}


/* Given a string, print out true if the number of appearances of "java" anywhere 
 in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
 

Sample Output:

     input: We study java not python
     output: true

     input: What's the difference between java, javascript and python?
     output: false */