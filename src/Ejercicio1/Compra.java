package Ejercicio1;

import java.util.Scanner;
public class Compra{	
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		float precio;
		int cantidad;
		float total;
		
		System.out.print("Ingrese precio: ");
		precio = teclado.nextFloat();
		System.out.print("Ingrese cantidad: ");
		cantidad = teclado.nextInt();
		
		total = precio * cantidad;
		
		System.out.print("Total a pagar: "+total);
		teclado.close();
	}
}

