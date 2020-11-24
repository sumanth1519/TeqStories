import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your choice (1-4): ");
		int choice = scanner.nextInt();
		
		switch(choice) {
		default:
			System.out.println("Invalid Choice");
			break;
		case 1:
			System.out.println("You have selected choice 1");
			break;
		case 2:
			System.out.println("You have selected choice 2");
			break;
		case 3:
			System.out.println("You have selected choice 3");
			break;
		case 4:
			System.out.println("You have selected choice 4");
			break;
		}
	}

}
