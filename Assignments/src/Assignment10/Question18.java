package Assignment10;

public class Question18 {

	public static void main(String[] args) {

		String word="This";
		String sep="And";
		int x=1;
		String count=word;
			for (int i=1; i<x; i++) {
				count+=sep+word;
			}
			System.out.println(count);
	}

}


/* Given two strings, word and a separator sep, 
 return a big string made of count occurrences of the word, 
 separated by the separator string.


Sample Output:

     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This*/