package Assignment10;

public class Question25 {

	public static void main(String[] args) {
		
		System.out.println(mergeStrings("12345","abcde"));
		System.out.println(mergeStrings("wooden","spoon"));
		System.out.println(mergeStrings("java","selenium"));
	}

		public static String mergeStrings(String x, String y) {
			String results="";String concats="";
			int len =0;
			
			if (x.length()<y.length()){
				len=x.length();
				for (int i=0;i<len;i++) {
					String sub1=x.substring(i,i+1);
					String sub2=y.substring(i,i+1);
					concats=concats+sub1+sub2;
					
				}
				results=concats+y.substring(len);
				}
			
			if (x.length()>=y.length()){
				len=y.length();
				for (int i=0;i<len;i++) {
				String sub1=x.substring(i,i+1);
				String sub2=y.substring(i,i+1);
				concats=concats+sub1+sub2;
								
				}
				results=concats+x.substring(len);
			}
		
			
	
		return results;
	}
		
	
}


/*When gears merge and work together, one tooth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. 
Please note one and two can be of different lengths. Please look at below examples:

     s1 ==> "12345"
     s2 ==> "abcde"
     mergeStrings(s1,s2) ==> "1a2b3c4d5e"

     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

     mergeStrings("java", "selenium") ==> "jsaevlaenium"*/