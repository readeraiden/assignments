package Assignment10;

public class Question30 {

	public static void main(String[] args) {

		System.out.println(at3("longword","foo"));
		System.out.println( at3("blabla","a"));

	}

	public static String at3(String x, String y) {
		String str="";
		
		str=str+x.substring(0,3)+y+x.substring(3);
		
		return str;
	}

}


/*at3 method gets two strings and returns a string. The first string is the one that will be manipulated. At the 3rd char position of the target you will insert the word argument.

Sample output:

     at3("longword","foo")
     return: "lonfoogword"

     at3("blabla","a")
     return: "blaabla"*/