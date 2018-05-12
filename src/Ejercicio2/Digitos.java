package Ejercicio2;

import java.util.Scanner;
public class Digitos{	
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		float num;
		
		System.out.print("Ingrese numero: ");
		num = teclado.nextFloat();
		
		if(num/100 >= 1) {
			System.out.print("El número tiene 3 o más cifras");
		} else {
			if(num/10 >= 1) {
				System.out.print("El número tiene 2 cifras");
			} else {
				System.out.print("El número tiene 1 cifra");
			}
		}
		teclado.close();
	}
}