package Assignment10;

public class Question17 {

	public static void main(String[] args) {

		char begin='B';
		char end='O';
		String letters="";
		
		for (char i=begin;i<=end;i++) {
			letters+=i;
		}
		System.out.println(letters);
	}

}


/* Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Sample Output:

     input: A
     input: Z
     output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

     input: a
     input: f
     output: abcdef

     input: a
     input: d
     output: abcd

     input: B
     input: O
     output: BCDEFGHIJKLMNO */