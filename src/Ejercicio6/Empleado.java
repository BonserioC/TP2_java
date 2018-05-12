package Ejercicio6;
import java.util.Scanner;

public class Empleado{
	private Scanner teclado;
	private String apellido;
	private float sueldo;
	public void ingreso() {
			teclado=new Scanner(System.in);
			System.out.print("Ingrese apellido: ");
			apellido=teclado.next();
			System.out.print("Ingrese sueldo: ");
			sueldo=teclado.nextFloat();
	}
	public void imprimir() {
		System.out.println("\nNombre: " +apellido);
		System.out.println("Sueldo: " +sueldo);
	}
	public void impuestos() {
		if (sueldo > 3000) {
			System.out.print("Usted debe pagar impuestos");
		} else {
			System.out.print("Usted no debe pagar impuestos");
		}
	}
	public static void main(String[]ar) {
		Empleado empleado1;
		empleado1 = new Empleado();
		empleado1.ingreso();
		empleado1.imprimir();
		empleado1.impuestos();
	}
}