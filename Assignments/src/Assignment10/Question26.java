package Assignment10;

public class Question26 {

	public static void main(String[] args) {
		
		System.out.println(uniqueChars("java"));
		System.out.println(uniqueChars("mama"));
		System.out.println(uniqueChars("spoon"));	
	
	}

			public static String uniqueChars(String x) {
				int count=0; 
				String unique = "";
				for (int i=0; i<x.length();i++) {
					if( ! unique.contains(x.substring(i,i+1))) {
							unique =unique+ x.charAt(i);													
					}

				}	
				return unique;
			}
}


/* uniqueChars is a method that you will code now, should be able to accept any string in the word and return unique characters from the parameter.

Sample Output:

     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon" */