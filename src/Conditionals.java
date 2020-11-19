import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Take a turn to Left or Right (0/1) : ");
		int choice = scanner.nextInt();
		
		if (choice == 0) {
			System.out.println("Turn on the Left Indicator");
		}
		else if (choice == 1) {
			System.out.println("Turn on the Right Indicator");
		}
		else {
			System.out.println("Invalid choice");
		}
	}
}
