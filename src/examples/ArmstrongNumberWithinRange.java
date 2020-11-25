package examples;

import java.util.Scanner;

public class ArmstrongNumberWithinRange {
	
	public static void main(String[] args) {
		
		System.out.print("Range: ");
		int range = new Scanner(System.in).nextInt();
		
		for (int number = 1; number <= range; number++) {
		
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
		}
	}
}
