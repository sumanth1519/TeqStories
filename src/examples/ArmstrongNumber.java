package examples;

import java.util.Scanner;

public class ArmstrongNumber {

	// 1^3 + 5^3 + 3^3 = 153
	// 1^4 + 2^4 + 3^4 + 4^4 = 1234
	
	public static void main(String[] args) {
		
		System.out.print("Your Number: ");
		int number = new Scanner(System.in).nextInt();
		
		// find out the number of digits
		String strNumber = number + "";    // 153, "153"
		int totalDigits = strNumber.length();
		
		int sum = 0;
		
		for (int i = 0; i < totalDigits; i++) {
			int digit = Integer.parseInt(strNumber.charAt(i) + "");
			
			sum = sum + (int)Math.pow(digit, totalDigits);
		}
		
		if (number == sum)
			System.out.println(number + " is Armstrong");
		else
			System.out.println(number + " is not Armstrong");
	}
}
