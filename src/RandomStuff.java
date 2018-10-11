import java.util.Scanner;

public class RandomStuff {

	public static void main(String []args) {
		
		// Print a statement
		System.out.print("I know how to print to the screen");
		
		// Declare an integer, double, and string. Also initialized them.
		int integer;
		integer = 5;
		double floater = 2.5;
		String testString = "Hello!";
		
		// Printing a statement with these included
		System.out.print("\nThe Integer is " + integer + " and the Double is " + floater + " and the test string is \"" + testString + "\"");
		
		// Now individually
		System.out.println("\n" + integer);
		System.out.println(floater);
		System.out.println("\n" + testString);
		
		// Multiply integer by 2 and floater by integer and add " concatenation" to string
		integer *= 2;
		floater *= integer;
		testString += " concatenation";
		
		//Print variables in list
		System.out.println("integer; " + integer);
		System.out.println("floater; " + floater);
		System.out.println("testString; " + testString);
		
		//Make some way to read input from the user
		Scanner jawn = new Scanner(System.in);
		
		//Promp for favorite sport and reply with their answer.
		System.out.println("What is your favorite sport? ");
		String favSport = jawn.nextLine();
		System.out.println("\n\nYour favorite sport is " + favSport + " and my favorite sport is Frisbee");
		
		
		
	}
}
