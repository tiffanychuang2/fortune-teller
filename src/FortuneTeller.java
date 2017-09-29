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
			
			System.out.println("Thank you, " + firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " " + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() + ". How old are you?");
			age = input.nextInt();
		
		
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
			
			System.out.println(""); //space between questions.
			input.nextLine();
		
		//Ask the user for the user’s favorite ROYGBIV color.
			//If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
			String color;
			
			System.out.println("What is your favorite \"ROYGBIV\" color?  Please respond \"Help\" for \"ROYGBIV\" colors.");
			color = input.nextLine().toLowerCase();
			
			//using if/else:
//			if (color.contains("help")) {
//				System.out.println("The \"ROYGBIV\" colors are: Red, Orange, Yellow, Green, Blue, Indigo, and Violet.");
//				System.out.println("What is your favorite \"ROYGBIV\" color?");
//				color = input.nextLine().toLowerCase();
//			} else if  (!color.contains("red") && 
//						!color.contains("orange") && 
//						!color.contains("yellow") && 
//						!color.contains("green") && 
//						!color.contains("blue") && 
//						!color.contains("indigo") && 
//						!color.contains("violet")) {
//				System.out.println("Please select a \"ROYGBIV\" color.");
//				color = input.nextLine().toLowerCase();
//			} else {
//				System.out.println("Well that's colorful.");
//			}
		//need loop :(
			
			//using switch
			switch(color) {
			case "help":
			System.out.println("The \"ROYGBIV\" colors are: Red, Orange, Yellow, Green, Blue, Indigo, and Violet.");
			System.out.println("What is your favorite \"ROYGBIV\" color?");
			color = input.nextLine();
			break;
			case "red":
			case "orange":
			case "yellow":
			case "green":
			case "blue":
			case "indigo":
			case "violet":
			System.out.println("Well that's colorful.");
			break;
			default:
				System.out.println("Please choose a \"ROYGBIV\" color.");
				color = input.nextLine();
			}
		
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
			}
		
		
//Part 2
		//For each of the below, you will select your own value for each condition. The table will give the conditions and an example for each.
			//Retirement Years
			
			//Vacation Home Location
			
			//Mode of Transportation
			
			//Bank Balance
			
		
		
		
		
		
		
		
		
//Part 3
		//Display the user's fortune in this format:
		//Your program should be able to process input whether a user enters capital or lowercase letters.
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
		
	}

}
