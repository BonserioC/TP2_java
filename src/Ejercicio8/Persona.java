package Ejercicio8;
import java.util.Scanner;

public class Persona{
	public Scanner teclado;
	private String nombre;
	private int edad;
	public void ingreso() {
			teclado=new Scanner(System.in);
			System.out.print("Ingrese nombre: ");
			nombre=teclado.next();
			System.out.print("Ingrese edad: ");
			edad=teclado.nextInt();
	}
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: " +edad);
	}
	
	public static void main(String[]ar) {
		Persona persona1;
		persona1 = new Persona();
		persona1.ingreso();
		persona1.imprimir();
	}
}
