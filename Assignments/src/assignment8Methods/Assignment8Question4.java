package assignment8Methods;

public class Assignment8Question4 {

	public static void main(String[] args) {
		
		printHollowRect();	
	}
		public static void printHollowRect() {
		for(int i=0;i<5;i++) {
			
				for(int j=0;j<5;j++) {
					//System.out.print("*");
					
					if(j==0||j==4||i==0||i==4) {
					
				System.out.print("*");
					}else
					
				System.out.print(" ");	
				
				}
				System.out.println();		
			}
			
	

		}

}


/*Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
  hint: you will need to use two nested for loops for that, 
  and an if that checks if its the last or first iteration of the loop 
  (so you will know whet to print "*" or " ")*/