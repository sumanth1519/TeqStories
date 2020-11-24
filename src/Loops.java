public class Loops {
	// performing repetitive tasks

	public static void main(String[] args) {
		
		// WHILE LOOP:  Initialization is outside the loop
		//				Condition is in the loop declaration
		//				Update is within the loop body
		
		int counter = 0;
		
		while(counter < 0) {
			System.out.print("counter: " + counter + "   ");
			System.out.print("While Teqstories");
			counter--;	// decrement by 1
			System.out.println("   counter: " + counter);
		}
		
		
		// FOR LOOP:	Initialization, Condition, Update are in the declaration
		
		for(int index = 0; index < 0; index++) {
			System.out.print("index: " + index + "   ");
			System.out.println("For Teqstories");
		}
		
		
		// DO WHILE:	Initialization is outside the loop
		//				Condition is in the loop declaration
		//				Update is within the loop body
		//				The BODY comes BEFORE the DECLARATION
		
		int c = 0;
		
		do {
			System.out.print("counter: " + c + "   ");
			System.out.print("Do While Teqstories");
			c++;
			System.out.println("   counter: " + c);
		} while(c < 0);
		
		System.out.println("Exiting....");
		
	}
}
