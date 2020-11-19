
public class ExpressionsOrOperations {

	public static void main(String[] args) {
		
		// numeric operations
		
		System.out.println("Typical Numeric operations: +, -, *, / -- with INT");
		int a = 10;
		int b = 3;
		
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		
		System.out.println("the value of c is " + c);
		System.out.println("the value of d is " + d);
		System.out.println("the value of e is " + e);
		System.out.println("the value of f is " + f);

		System.out.println("Typical Numeric operations: +, -, *, / -- with DOUBLE");
		
		double g = 10.2;
		double h = 3.5;
		
		double i = g + h;
		double j = g - h;
		double k = g * h;
		double l = g / h;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		// Further Mathematical Operations

		System.out.println("Advanced Numeric operations");
		
		double m = Math.pow(a, b);
		System.out.println(m);
		
		double n = Math.PI * Math.pow(20, 2);
		System.out.println(n);
		
		double o = Math.max(5, 10);
		System.out.println(o);
		
		
		// String operations

		System.out.println("String operations");
		
		String p = "Hello";
		String q = "Sumanth";
		String r = p + " " +  q; // HelloSumanth
		
		System.out.println(r);
		
		String s1 = "Ram\tPatel";		// tab
		String s2 = "Shyam\tMohan";		// tab
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "Hello Ram,\n\n\tHow are you doing?\nHope all is well at your end.\n\nRegards,\nVishal";
		System.out.println(s3);
		
		System.out.println("3" + "5");

	}

}
