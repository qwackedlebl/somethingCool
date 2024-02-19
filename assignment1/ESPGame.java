
/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: ESP Random Color Guessing Game
 * Due: 02/05/2024
 * Platform/compiler: Windows, javac
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: LEV BELOLIPETSKI
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args) {

		// initialization step

		Scanner scanStuff = new Scanner(System.in);
		String userName;
		String userDescription;
		String userDueDate;

		System.out.println("What is your name?");
		userName = scanStuff.nextLine();
		System.out.println("Describe yourself.");
		userDescription = scanStuff.nextLine();
		System.out.println("Due date:");
		userDueDate = scanStuff.nextLine();
		System.out.println("CMSC 203 Assignment 1: Test your ESP skills!");

		// initializations

		int roundCount = 0;
		int userScore = 0;
		boolean repeatRound = false;
		String userGuess;
		double randomNum = 0;
		Random randomGenerator = new Random();

		do {

			if (repeatRound == false) {

				roundCount++;
				randomNum = randomGenerator.nextDouble();
				randomNum *= 5;

			}

			System.out.println();
			System.out.println("Round " + roundCount);

			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			if (repeatRound)
				System.out.println("Enter your guess again:");
			else
				System.out.println("Enter your guess:");

			userGuess = scanStuff.nextLine();
			userGuess = userGuess.toLowerCase();

// decode user input into a value

			switch (userGuess) {
			case "red":
			case "green":
			case "blue":
			case "orange":
			case "yellow":

				System.out.println();
				System.out.print("I was thinking of ");

				if (randomNum < 1) {
					System.out.println("Red.");
					if (userGuess.equals("red"))
						userScore++;
				} else if (randomNum < 2) {
					System.out.println("Green.");
					if (userGuess.equals("green"))
						userScore++;
				} else if (randomNum < 3) {
					System.out.println("Blue.");
					if (userGuess.equals("blue"))
						userScore++;
				} else if (randomNum < 4) {
					System.out.println("Orange.");
					if (userGuess.equals("orange"))
						userScore++;
				} else if (randomNum < 5) {
					System.out.println("Yellow.");
					if (userGuess.equals("yellow"))
						userScore++;
				} else {
					System.out.println("ERROR WITH RANDOM NUMBER USE!");
				}

				System.out.println();

				

				repeatRound = false;

				break;
			default:
				System.out.println("Invalid color or input. Please try again!");
				repeatRound = true;

				break;
			}

		} while (roundCount < 10);

		System.out.println();
		System.out.println("You guessed " + userScore + " out of 10 colors correctly.");
		System.out.println();
		System.out.println("UserName: " + userName);
		System.out.println("UserDescription: " + userDescription);
		System.out.println("DueDate: " + userDueDate);

		System.out.println();
		System.out.println("Programmer name: Lev Belolipetski");
		
		
		scanStuff.close();

		System.exit(0);

	}
}
