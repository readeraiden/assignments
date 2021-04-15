package Lab2;

import java.util.Scanner;

public class Lab2Question4 {
	public static void main(String[] args) {
		
		Scanner numberOfStudent = new Scanner(System.in);
		
		int percentageOfMale,percentageOfFemale ;
		
		System.out.print("Enter the number of Male students=");
		int maleStudent = numberOfStudent.nextInt();
		
		System.out.print("Enter the number of Female students=");
		
		int femaleStudent = numberOfStudent.nextInt();
		
		int sum= (maleStudent+femaleStudent);
		percentageOfMale=(maleStudent*100/sum);
		percentageOfFemale=(femaleStudent*100/sum);
		
		System.out.println("Percentage of Male Student is=" + percentageOfMale);
		System.out.println("Percentage of Male Student is=" + percentageOfFemale);
	}
}

/*Write a program that asks user for the number of males and the number of females 
 * registered in a class. The program should display the percentage of males 
 * and females in the class.*/