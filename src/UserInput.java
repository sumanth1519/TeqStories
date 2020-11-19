import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		// we opened up a channel to take input from the user
		
		System.out.print("Please enter a number: ");
		double a = scanner.nextDouble();				// we took an input

		System.out.print("Please enter another number: ");
		double b = scanner.nextDouble();				// we took an input
		
		double c = a + b;
		double d = a - b;
		double e = a * b;
		double f = a / b;
		
		System.out.println("the value of c is " + c);
		System.out.println("the value of d is " + d);
		System.out.println("the value of e is " + e);
		System.out.println("the value of f is " + f);
		
		scanner.nextLine();								// consume the ENTER key that we pressed earlier
		
		System.out.print("Enter your name please: ");
		String name = scanner.nextLine();
		System.out.println("Your name is " + name);
		
		
		
		scanner.close();								// we are closing the channel to take input
	}

}
