package assignment_3;

/* Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine 
in a drink and outputs how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose */

public class Question6 {

	public static void main(String[] args) {
		int numberOfMilligrams=500;//miligram
		int lethalOverdose=10000;//10 gram=10000
		int numberOfDrinks=lethalOverdose/numberOfMilligrams;
		System.out.println("It would take about " + numberOfDrinks + " drinks for a lethal overdose");

	}

}
