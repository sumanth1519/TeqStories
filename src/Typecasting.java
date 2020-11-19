
public class Typecasting {		// forcefully changing the DataType of the variable

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		double c = a / (double)b;
		
		System.out.println(c);
		
		String d1 = "5";
		String d2 = "3";
		
		int e1 = Integer.parseInt(d1);
		int e2 = Integer.parseInt(d2);
		
		System.out.println(d1 + d2);
		System.out.println(e1 + e2);
		

	}

}
