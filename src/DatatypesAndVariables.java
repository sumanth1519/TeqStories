public class DatatypesAndVariables {

	public static void main(String[] args) {
		
		// Variables: names allocated to some memory blocks where we can store our data
		// Datatypes: specifying the kind of data that we are trying to store in the variable
		
		
		//----------Primitive Datatypes-----------//
		
		
		// numeric datatypes
		byte    a = 10;			// range:  -128 to 127
		short   b = 20;			// range:  -32,768 to 32,767
		int     c = 30;			// range:  -2,147,483,648 to 2,147,483,647
		long    d = 40l;		// range:  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		// decimal numbers
		float   e = 10.567f;	// 4 bytes
		double  f = 20.44;		// 8 bytes
		
		// binary option
		boolean g = true;		// 1 byte
		boolean h = false;		// 1 byte
		
		// single character
		char    i = '8';		// 2 bytes
		char    j = 'a';		// 2 bytes
		char    k = 'E';		// 2 bytes
		char    l = '*';		// 2 bytes
		
		
		//----------Non-Primitive Datatypes-----------//
		
		String  phoneNumber_1 = "My phone number is 0011223344";
		String  phoneNumber2 = "My phone number is 9876543210";
		String  homeAddress  = "My home address is 223-B baker street, London";
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		System.out.println(phoneNumber_1);
		System.out.println(phoneNumber2);
		System.out.println(homeAddress);
	}

}
