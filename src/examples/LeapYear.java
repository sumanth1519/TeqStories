package examples;

import java.util.Scanner;

public class LeapYear {

	// if a year is not a 00 ending year, and it is divisible by 4, it is Leap
	// if a year is a 00 ending year, and it is divisible by 400, it is Leap
	
	public static void main(String[] args) {

		System.out.print("Year: ");
		int year = new Scanner(System.in).nextInt();
		
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
}
