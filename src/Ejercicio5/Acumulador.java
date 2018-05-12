package Ejercicio5;

import java.util.Scanner;
public class Acumulador{	
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		float a = 0; //acumulador
		float v = 0; //valor
		System.out.print("Para salir del acumulador ingrese 9999.\n");
		while (v != 9999) {
			System.out.print("Acumulado: "+a+"\nNúmero a sumar: ");
			v = teclado.nextFloat();
			if (v != 9999) {
				a = a + v;
			}
			System.out.print("\n");			
		}
		if (a == 0) {
			System.out.print("Lo acumulado ("+a+") es igual a 0");
		} else {
			if (a > 0) {
				System.out.print("Lo acumulado ("+a+") es mayor a 0");
			} else {
				System.out.print("Lo acumulado ("+a+") es menor a 0");
			}
		}
		teclado.close();
	}
}