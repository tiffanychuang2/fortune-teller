import java.util.Scanner;

public class FortuneTellerPlusStretch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Part One
		// Ask the user for the user’s first name.
		// String firstName;

		System.out.println("Hello!  What is your first name?");
		String firstName = input.nextLine().toLowerCase();
		checkForQuit(firstName);

		if (firstName.equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		// Ask the user for the user’s last name.
		// String lastName;

		System.out.println("Welcome, " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase()
				+ "!  What is your last name?");
		String lastName = input.nextLine().toLowerCase();
		checkForQuit(lastName);

		if (lastName.equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		// Ask the user for the user’s age.
		// String age;
		int ageNumber = 0;

		System.out.println("Thank you, " + firstName.substring(0, 1).toUpperCase()
				+ firstName.substring(1).toLowerCase() + " " + lastName.substring(0, 1).toUpperCase()
				+ lastName.substring(1).toLowerCase() + ". How old are you?");
		String age = input.nextLine().toLowerCase();

		checkForQuit(age);
		if (!age.equals("quit")) {
			ageNumber = Integer.parseInt(age);
		}

		// Ask the user for the user’s birth month (as an 'int').
		// String birthMonth;
		// int monthNumber = 0;

		System.out.println(
				"What is your birth month?  Please use number format, ex: \"1\" for January, \"12\" for December, etc.");
		String birthMonth = input.nextLine();
		checkForQuit(birthMonth);

		if (!birthMonth.equals("quit")) {
			int monthNumber = Integer.parseInt(birthMonth);

			if (monthNumber >= 13) {
				System.out.println("There are only 12 months in a year.  Please enter your correct birth month.");
				monthNumber = input.nextInt();
			} else {
				System.out.println("Thank you!\n");
			}

			//input.nextLine();

			// Ask the user for the user’s favorite ROYGBIV color.
			// If the user does not know what ROYGBIV is, ask the user to enter “Help” to
			// get a list of the ROYGBIV colors.
			// String color;

			System.out.println(
					"What is your favorite \"ROYGBIV\" color?  Please respond \"Help\" for \"ROYGBIV\" colors.");
			String color = input.nextLine().toLowerCase();
			checkForQuit(color);

			// using if/else:
			// if (color.contains("help")) {
			// System.out.println("The \"ROYGBIV\" colors are: Red, Orange, Yellow, Green,
			// Blue, Indigo, and Violet.\n\nWhat is your favorite \"ROYGBIV\" color?");
			// color = input.nextLine().toLowerCase();
			// }

			while (color.equals("help")) {
				System.out.println(
						"The \"ROYGBIV\" colors are: Red, Orange, Yellow, Green, Blue, Indigo, and Violet.\nWhat is your favorite \"ROYGBIV\" color?");
				color = input.nextLine().toLowerCase();
			}

			if (color.equals("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			} else if (!color.contains("red") && !color.contains("orange") && !color.contains("yellow")
					&& !color.contains("green") && !color.contains("blue") && !color.contains("indigo")
					&& !color.contains("violet")) {
				System.out.println("Please select a \"ROYGBIV\" color.");
				color = input.nextLine().toLowerCase();
			} else {
				System.out.println("Well that's colorful.\n");
			}

			// using switch
			// switch(color) {
			// case "help":
			// System.out.println("The \"ROYGBIV\" colors are: Red, Orange, Yellow, Green,
			// Blue, Indigo, and Violet.\n\nWhat is your favorite \"ROYGBIV\" color?");
			// color = input.nextLine();
			// break;
			// case "red":
			// case "orange":
			// case "yellow":
			// case "green":
			// case "blue":
			// case "indigo":
			// case "violet":
			// System.out.println("Well that's colorful.");
			// break;
			// default:
			// System.out.println("Please choose a \"ROYGBIV\" color.");
			// color = input.nextLine();
			// }

			// if (lastName.equals("quit")) {
			// System.out.println("Nobody likes a quitter...");
			// System.exit(0);

			//input.nextLine();

			// Ask the user for the user's number of siblings.
			// String siblings;
			double numberOfSiblings = 0;

			System.out.println("How many siblings do you have?");
			String siblings = input.nextLine();
			checkForQuit(siblings);

			if (!siblings.equals("quit")) {
				numberOfSiblings = Integer.parseInt(siblings);
			} else if (numberOfSiblings == 0) {
				System.out.println("Only child.  Nice.");
			} else if (numberOfSiblings >= 4 && numberOfSiblings < 6) {
				System.out.println("That's a pretty big family!");
			} else if (numberOfSiblings >= 6) {
				System.out.println("Your parents are nuts.");
			} else {
				System.out.println("How fun.");
			}

			System.out.println("Let's see your fortune!");
			input.nextLine();

			// Part 2
			// For each of the below, you will select your own value for each condition. The
			// table will give the conditions and an example for each.
			// Retirement Years
			// The user's number of years until retirement will be based on whether the
			// user's age is odd or even.
			int retirementYears;

			if (ageNumber % 2 == 0) {
				retirementYears = 26;
			} else {
				retirementYears = 25;
			}

			// Vacation Home Location
			// The location of the user's vacation home will be based on how many siblings
			// the user has.
			// If the user enters a number less than zero, give the user a bad location!
			String vacaHome;

			if (numberOfSiblings == 0) {
				vacaHome = ("Argentina");
			} else if (numberOfSiblings == 1) {
				vacaHome = ("Costa Rica");
			} else if (numberOfSiblings == 2) {
				vacaHome = ("Italy");
			} else if (numberOfSiblings == 3) {
				vacaHome = ("Florida");
			} else if (numberOfSiblings > 3) {
				vacaHome = ("Colorado");
			} else {
				vacaHome = ("Oymyakon, Russia (sorry)");
			}

			// else if (siblings < 0) {
			// System.out.println("Your vacation home will be in Oymyakon, Russia. Sorry.");
			// }

			// Mode of Transportation
			// The user's mode of transportation will determined by the user's favorite
			// color.
			String transportation = null;

			if (color.contains("red")) {
				transportation = ("McLaren P1 LM");
			} else if (color.contains("orange")) {
				transportation = ("unicycle");
			} else if (color.contains("yellow")) {
				transportation = ("walking");
			} else if (color.contains("green")) {
				transportation = ("Honda Fit");
			} else if (color.contains("blue")) {
				transportation = ("public transportation");
			} else if (color.contains("indigo")) {
				transportation = ("flying broom");
			} else if (color.contains("violet")) {
				transportation = ("town car and driver");
			}

			// Bank Balance
			// The user's bank balance at retirement will be based on the user's birth
			// month.
			// If the user enters something other than 1-12 for birth month, the user's
			// balance will be $0.00.
			double retirementBalance;

			if (monthNumber >= 1 && monthNumber <= 4) {
				retirementBalance = 6298859.81;
			} else if (monthNumber >= 5 && monthNumber <= 8) {
				retirementBalance = 5948500.24;
			} else if (monthNumber >= 9 && monthNumber <= 12) {
				retirementBalance = 4273709.75;
			} else {
				retirementBalance = 0.00;
			}

			// Part 3
			// Display the user's fortune in this format:

			// *[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank
			// balance]* in the bank,
			// a vacation home in *[location]*, and travel by *[mode of transporation]*.

			// Your program should be able to process input whether a user enters capital or
			// lowercase letters.

			System.out.println(firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " "
					+ lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase() + " will retire in "
					+ retirementYears + " years with $" + retirementBalance + " in the bank, a vacation home in "
					+ vacaHome + ", and travel by " + transportation + ".");
		}

		// Stretch tasks
		// Give the user the ability to quit the program by typing "Quit" (should not be
		// case sensitive) at any point where the program is looking for user input.
		// The program should print “Nobody likes a quitter...” before ending.
		// Tip: To do this with the prompts that expect an integer, you will need to
		// read in a String, check for "Quit",
		// then use Integer.parseInt(value) to convert the user input to an int.
		// Also tip: You can call System.exit(0); to terminate your program immediately.
		// Also also tip: Rather than typing the same code over and over, you can create
		// a method that calls System.exit(0);
		// if the user typed "Quit", then call that method, passing it the user input.
		// Its signature should look something like:

		// public static void checkForQuit(String userInput)

		// Research while (page 115 in the Head Start book) or do/while loops and
		// use them to check whether a user typed "Help" for favorite color, printing
		// the list of colors each time the user types "Help".
		// What is your favorite ROYGBIV color?
		// Help
		// The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.
		// Help
		// The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.
		// Blue

	}

	public static void checkForQuit(String userInput) {
		if (userInput.equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
	}

}
