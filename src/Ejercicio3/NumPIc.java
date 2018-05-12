package Ejercicio3;

import java.util.Scanner;
public class NumPIc{	
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		int [] nums = new int[10];
		int impares = 0;
		int pares = 0;
		int cero = 0;
		int i;
		for (i = 0; i< 10; i++) {
			System.out.print("Ingrese numero: ");
			nums[i] = teclado.nextInt();
		}
		
		for (i = 0; i< 10; i++) {
			if (nums[i] == 0) {
				cero++;
			} else {
				if (nums[i] %2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}
		System.out.print("Pares: "+pares+"\nImpares: "+impares+"\nCeros: "+cero);
		teclado.close();
	}
}