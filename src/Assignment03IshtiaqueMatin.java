/*
 *Student Name: Ishtiaque Matin
 *Theory Professor: Siju Philip
 *Theory Section Number: CST8116_360
 *Lab Professor: Siju Philip
 *Lab Section Number: CST8116_363
 * Due Date: Dec 3rd, 2021
 * Modified: Dec 3rd, 2021
 * Description: This class will randomly generate a number such as rolling the 
 * dice. It rolls a 10 sided dice 1000 times and records the number of occurrences of each result.
 * 
 * 
 */
public class Assignment03IshtiaqueMatin {

	public static void main(String[] args) {
		int roll = 0;
		int[] diceRolls = new int[10];
		int totalRolls = 0;

		// sample the rolls
		for (int count = 0; count < 1000; count++) {

			// Math.random() returns 0.0 to 1.0 excluding 1.0
			roll = (int) (Math.random() * 10) + 1;
			diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}
		// run a report
		for (int index = 0; index < diceRolls.length; index++) {
			System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
			totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Ishtiaque Matin");

	}

}
