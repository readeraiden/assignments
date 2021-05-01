package Assignment10;

public class Question28 {

		public static void main(String[] args) {
			
			System.out.println(cleanText("one two three","two"));
			System.out.println(cleanText("foo bar","foo"));
			System.out.println(cleanText("he said bla bla bla","bla"));
		}

		public static String cleanText(String x, String y) {
			String str="";
			str=""+x.replace(y, "");
			str=str.trim();
			return str;
		}
		

			
		
}


/* This method gets two strings (text and badWord) and returns a string. Basicly what it does is take out all the occurrences of badWord in text.

Sample Output:

     clean ("one two three","two")
     returns "one three"

     clean ("foo bar","foo")
     returns "bar"

     clean ("he said bla bla bla","bla")
     returns "he said " */