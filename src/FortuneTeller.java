import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
//Part One
		//Ask the user for the user’s first name.
			String firstName;
		
			System.out.println("Hello!  What is your first name?");
			firstName = input.nextLine();
		
		
		//Ask the user for the user’s last name.
			String lastName;
		
			System.out.println("Welcome, " + firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + "!  What is your last name?");
			lastName = input.nextLine();
					
		
		//Ask the user for the user’s age.
			int age;
			
			System.out.println("Thank you, " + firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " " 
					+ lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() + ". How old are you?");
			age = input.nextInt();
			
			//if user inputs 0 or less for age.  part two references a "less than 0" vacation home.
//			if (age <= 0) {
//				System.out.println("You are not zero years old.  Please try again.\nHow old are you?");
//				age = input.nextInt();
//			}
//		
		
		//Ask the user for the user’s birth month (as an 'int').
			int birthMonth;
			
			System.out.println("What is your birth month?  Please use number format, ex: \"1\" for January, \"12\" for December, etc.");
			birthMonth = input.nextInt();
			
			if (birthMonth >= 13) {
				System.out.println("There are only 12 months in a year.  Please enter your correct birth month.");
				birthMonth = input.nextInt();
			} else {
				System.out.println("Thank you!");
			}
			
			input.nextLine();
			input.nextLine();
		
		//Ask the user for the user’s favorite ROYGBIV color.
			//If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
			String color;
			
			System.out.println("What is your favorite \"ROYGBIV\" color?  Please respond \"Help\" for \"ROYGBIV\" colors.");
			color = input.nextLine().toLowerCase();
			
			//using if/else:
			if (color.contains("help")) {
				System.out.println("The \"ROYGBIV\" colors are: Red, Orange, Yellow, Green, Blue, Indigo, and Violet.\n\nWhat is your favorite \"ROYGBIV\" color?");
				color = input.nextLine().toLowerCase();
			} else if  (!color.contains("red") && 
						!color.contains("orange") && 
						!color.contains("yellow") && 
						!color.contains("green") && 
						!color.contains("blue") && 
						!color.contains("indigo") && 
						!color.contains("violet")) {
				System.out.println("Please select a \"ROYGBIV\" color.");
				color = input.nextLine().toLowerCase();
			} else {
				System.out.println("Well that's colorful.");
			}
		//need loop :(
			
			//using switch
//			switch(color) {
//			case "help":
//			System.out.println("The \"ROYGBIV\" colors are: Red, Orange, Yellow, Green, Blue, Indigo, and Violet.\n\nWhat is your favorite \"ROYGBIV\" color?");
//			color = input.nextLine();
//			break;
//			case "red":
//			case "orange":
//			case "yellow":
//			case "green":
//			case "blue":
//			case "indigo":
//			case "violet":
//			System.out.println("Well that's colorful.");
//			break;
//			default:
//				System.out.println("Please choose a \"ROYGBIV\" color.");
//				color = input.nextLine();
//			}
			
			input.nextLine();
			
		
		//Ask the user for the user's number of siblings.
			double siblings;
			
			System.out.println("How many siblings do you have?");
			siblings = input.nextDouble();
			
			if (siblings == 0) {
				System.out.println("Only child.  Nice.");
			} else if (siblings >= 4 && siblings < 6) {
				System.out.println("That's a pretty big family!");
			} else if (siblings >=6) {
				System.out.println("Your parents are nuts.");
			} else {
				System.out.println("How fun.");
				input.nextLine();
			}
		
			System.out.println("Let's see your fortune!");
			input.nextLine();
		
//Part 2
		//For each of the below, you will select your own value for each condition. The table will give the conditions and an example for each.
			//Retirement Years
				//The user's number of years until retirement will be based on whether the user's age is odd or even.
			
			
			if (age%2 == 0) {
				System.out.println("You will retire when you are 66 years old.");
			} else {
				System.out.println("You will retire when you are 67 years old.");
			}

			
			//Vacation Home Location
				//The location of the user's vacation home will be based on how many siblings the user has. 
				//If the user enters a number less than zero, give the user a bad location!
			
			
			if (siblings == 0) {
				System.out.println("Your vacation home will be in Argentina.");
			} else if (siblings == 1) {
				System.out.println("Your vacation home will be in Costa Rica.");
			} else if (siblings == 2) {
				System.out.println("Your vacation home will be in Italy.");
			} else if (siblings == 3) {
				System.out.println("Your vacation home will be in Florida.");
			} else if (siblings > 3) {
				System.out.println("Your vacation home will be in Colorado.");
			} else {
				System.out.println("Your vacation home will be in Oymyakon, Russia.  Sorry.");
			}
			
//			else if (siblings < 0) {
//				System.out.println("Your vacation home will be in Oymyakon, Russia.  Sorry.");
//			}
			

			//Mode of Transportation
				//The user's mode of transportation will determined by the user's favorite color.
			
			
			if (color.contains("red")) {
				System.out.println("You drive a McLaren P1 LM.  You need to chill out with the spending and drive safely.");
			} else if (color.contains("orange")) {
				System.out.println("You prefer to travel on a unicycle.  If you don't have one now, you will.");
			} else if (color.contains("yellow")) {
				System.out.println("You prefer to walk from place to place.  Health is good.");
			} else if (color.contains("green")) {
				System.out.println("You drive a Honda Fit.  Very practical.  Good for you.");
			} else if (color.contains("blue")) {
				System.out.println("You prefer to travel via public transportation.  Bring hand sanitizer, bleach wipes, and headphones.");
			} else if (color.contains("indigo")) {
				System.out.println("You travel all kinds of ways.  Car, public transport, walk, you just like to mix it up, don't you.");
			} else if (color.contains("violet")) {
				System.out.println("You have a town car and driver to transport you from place to place.  How nice.");
			}
			
			
			
			
			//Bank Balance
				//The user's bank balance at retirement will be based on the user's birth month. 
				//If the user enters something other than 1-12 for birth month, the user's balance will be $0.00.
			if (birthMonth >= 1 && birthMonth <= 4) {
				System.out.println("Your bank balance at retirement will be $6,298,859,81.");
			} else if (birthMonth >= 5 && birthMonth <= 8) {
				System.out.println("Your bank balance at retirement will be $5,948,500.24.");
			} else if (birthMonth >= 9 && birthMonth <=12) {
				System.out.println("Your bank balance at retirement will be $4,273,709.75.");
			} else {
				System.out.println("Your bank balance at retirement will be $0.00.  Tough luck.");
			}
			

		
//Part 3
		//Display the user's fortune in this format:
			//*[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank,
			//a vacation home in *[location]*, and travel by *[mode of transporation]*.
		//Your program should be able to process input whether a user enters capital or lowercase letters.
		
		System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " " 
				+ lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() + " will retire in ");
		
		
		
		
		
		
		
		
		
		
		
		input.close();
		
	}

}
