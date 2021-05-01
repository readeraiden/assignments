package Assignment10;

public class Question16 {

	public static void main(String[] args) {
		
		//String str="javapython";
		//String str="cjavac++";
		String str="c#javaruby";
		
		boolean check = true;
		
		for(int i=0;i<2;i++) {
			if (str.length()>4 && str.substring(i,i+4).equalsIgnoreCase("java")) {
				check = true;
				break;
				
			}
				else {
					check = false;
				
				}
			
		}
		if(check) {
			System.out.println(true);
		}else {
			System.out.println(false);
	}

}
			
}


/*Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
 such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string should be 4 and more characters.
 

Sample Output:
     input: javapython
     output: true

     input: cjavac++
     output: true

     input: c#javaruby
     output: false*/