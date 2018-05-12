package Ejercicio8;

public class Empleado extends Persona {
	protected int sueldo;
	public void ingresoS() {
		System.out.print("Ingrese sueldo: ");
		sueldo = teclado.nextInt();
	}
	public void imprimirS() {
		System.out.println("Sueldo: "+sueldo);
	}
}
