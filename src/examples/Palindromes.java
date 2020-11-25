package examples;

import java.util.Scanner;

public class Palindromes {

	// String -> read same from L to R and R to L
	// 012345
	// AABBAA => length = 6
	// ptr = 0,   text.length() - ptr - 1 = 5
	// ptr = 1,   text.length() - ptr - 1 = 4
	// ptr = 2,   text.length() - ptr - 1 = 3
	// ptr = 3,   text.length() - ptr - 1 = 2
	
	public static void main(String[] args) {
		
		System.out.print("Enter your text: ");
		String text = new Scanner(System.in).nextLine();
		
		boolean isPalindrome = true;
		
		for (int ptr = 0; ptr <= text.length() / 2; ptr++) {
			
			if (text.charAt(ptr) != text.charAt(text.length() - ptr - 1)) {
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome == true)
			System.out.println(text + " is Palindrome");
		else
			System.out.println(text + " is not a palindrome");
	}
}
