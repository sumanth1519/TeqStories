import java.util.Scanner;

public class Conditionals2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Is it Raining? ");
		boolean rainingStatus = scanner.nextBoolean();
		

		System.out.print("Is it Sunny? ");
		boolean sunnyStatus = scanner.nextBoolean();
		
		if (rainingStatus == true || sunnyStatus == true) {
			System.out.println("Take an umbrella");
		}
		else {
			System.out.println("Don't take an umbrella");
		}
		
	}
}
