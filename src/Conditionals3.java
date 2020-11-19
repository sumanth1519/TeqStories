import java.util.Scanner;

public class Conditionals3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Is it Raining? ");
		boolean rainingStatus = scanner.nextBoolean();
		

		System.out.print("Is it evening? ");
		boolean eveningStatus = scanner.nextBoolean();
		
		if (rainingStatus == true && eveningStatus == true) {
			System.out.println("Take a cab");
		}
		else if (rainingStatus == true) {
			System.out.println("Take a cab or a bus");
		}
		else if (eveningStatus == true) {
			System.out.println("Take a motorbike");
		}
		else {
			System.out.println("Take whatever");
		}
		
	}
}
