package examples;

import java.util.Scanner;

public class FibonacciSeries {

	//                 t1 + t2 = ct
	//	0    1    1    2    3    5    8    13    21
	
	public static void main(String[] args) {
		
		int term1 = 0;
		int term2 = 1;
		
		System.out.print("Number of terms: ");
		int totalTerms = new Scanner(System.in).nextInt(); 
		
		if (totalTerms <= 0)
			System.out.println("Nothing to Show");
		else if (totalTerms == 1)
			System.out.println(term1);
		else if (totalTerms == 2)
			System.out.println(term1 + " " + term2);
		else {
			System.out.print(term1 + " " + term2 + " ");
			
			for (int term = 3; term <= totalTerms; term++) {
				int currentTerm = term1 + term2;
				System.out.print(currentTerm + " ");
				term1 = term2;
				term2 = currentTerm;
			}
		}
		
	}
}
