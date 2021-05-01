package Assignment10;

public class Question23 {

	public static void main(String[] args) {

		//String str="breadjambread";
		//String str="xxbreadjambreadyy";
		//String str="xxbreadapple";
		String str="breadbutterbread";		
		
			int count=0;
			
			for(int i=0;i<str.length()-4;i++) {
				if (str.substring(i,i+5).equals("bread")) {
				count++;
				}
			}
				
				if (count<2) {
					System.out.println("nothing!");
				} else {
					
					int first = str.indexOf("bread");
					int second = str.indexOf("bread", first+5);
					System.out.println(str.substring(first+5, second));
				}
				
		
			
			
				
				
				
			
				
				
		

	}

}


/* A sandwich is two pieces of bread with something in between. 
   Print the string that is between the first and last appearance of "bread" in the given string, 
   or return string "nothing" if there are not two pieces of bread.
 

Sample Output:

     input: breadjambread
     output: jam

     input: xxbreadjambreadyy
     output: jam

     input: xxbreadapple
     output: nothing

     input: breadbutterbread
     output: butter */