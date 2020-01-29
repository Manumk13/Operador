package cghdpotemmpcdm;

import java.util.Scanner;

public class Ordenacion {
	static int a;
	static int b;
	static int c;


	
	public static String ordena3(int a, int b, int c) {

	
		
		System.out.println("Los números ordenados de mayor a menor son:");
		if (a >= b && b >= c) {
			String f = (a+">" + b +">"+c);
			return f;
		} else if (a >= c && c >= b) {

			String f=(a+">" + c+">" + b );
			return f;
		} else if (b >= a && a >= c) {

			String f=(b+">" +a+">"+ c );
			return f;
		} else if (b >c && c >a) {

			String f=(b +">" + c +">" + a);
			return f;
		} else if (c >= a && a >= b) {
 
			String f=(c+">" + a+">" +b);
			return f;
		} else {
			String f=( c+">" + b +">" +a );
			return f;
		}
	}

}
