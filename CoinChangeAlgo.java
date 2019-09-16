import java.util.Scanner;

public class CoinChangeAlgo {

	// Algorithm Homework 8 Ron Licciardi
	public static void main(String[] args) {

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in cents: ");
		int amount = input.nextInt();
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		int remainingAmount = amount;

		System.out.println("");

		// Find the number of quarters in the remaining amount
		quarters = remainingAmount / 25;
		System.out.println("quarters = " + amount + " / 25  = " + quarters);

		remainingAmount = remainingAmount % 25;
		System.out.println("remainder = " + amount + " % 25 = " + remainingAmount);

		// Find the number of dimes in the remaining amount
		dimes = remainingAmount / 10;
		System.out.println("dimes = " + remainingAmount + " / 10  = " + dimes);
		System.out.println("remainder = " + remainingAmount + " % 10 = " + remainingAmount % 10);
		remainingAmount = remainingAmount % 10;
		// System.out.println("");

		// Find the number of nickels in the remaining amount
		nickels = remainingAmount / 5;
		System.out.println("nickels = " + remainingAmount + " / 5  = " + nickels);
		System.out.println("remainder = " + remainingAmount + " % 5 = " + remainingAmount % 5);
		remainingAmount = remainingAmount % 5;
		// System.out.println("");

		// Find the number of pennies in the remaining amount
		pennies = remainingAmount;
		System.out.println("pennies = remainder = " + remainingAmount);
		// System.out.println("");
		// Display results
		System.out.println("Change for " + amount + ":");
		System.out.println(" " + quarters + " quarters ");
		System.out.println(" " + dimes + " dimes");
		// System.out.println(" " + nickels + " nickels");
		System.out.println(" " + pennies + " pennies");

		int totalCoins = (quarters + dimes + pennies);
		System.out.println(" " + totalCoins + " Total coins");
		input.close();
	}
}
