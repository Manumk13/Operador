package cghdpotemmpcdm;

import java.util.Scanner;

public class Ordenacion {
	static int a;
	static int b;
	static int c;

	public static void main(String[] args) {
		System.out.println("Bienvenido a la app palindromo ");
		ordena3( a , b , c );
	}

	public static void ordena3(int a ,int b , int c) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Primer n�mero:");
		a = teclado.nextInt();

		System.out.println("Segundo n�mero:");
		b = teclado.nextInt();
		System.out.println("Tercer n�mero:");
		c = teclado.nextInt();

		System.out.println("Los n�meros ordenados de mayor a menor son:");
		if (a >= b && b >= c) {
			System.out.println(" " + a + " " + b + " " + c + "");
		} else if (a >= c && c >= b) {

			System.out.println(" " + a + " " + c + " " + b + "");
		} else if (b >= a && a >= c) {

			System.out.println(" " + b + " " + a + " " + c + "");
		} else if (b >= c && c >= a) {

			System.out.println(" " + b + " " + c + " " + a + "");
		} else if (c >= a && a >= b) {

			System.out.println(" " + c + " " + a + " " + b + "");
		} else {
			System.out.println(" " + c + " " + b + " " + a + "");
		}
	}
}
