package Ejercicio7;
import java.util.Scanner;

public class Operaciones{
	private Scanner teclado;
	private float n1; //numero 1
	private float n2; //numero 2
	private float r; //resultado
	public void ingreso() {
			teclado=new Scanner(System.in);
			System.out.print("Ingrese numero uno: ");
			n1=teclado.nextInt();
			System.out.print("Ingrese numero dos: ");
			n2=teclado.nextInt();
	}
	public float suma() {
		r = n1 + n2;
		return r;
	}
	public float resta() {
		r = n1 - n2;
		return r;
	}
	public float multi() {
		r = n1 * n2;
		return r;
	}
	public float div() {
		r = n1 / n2;
		return r;
	}
	public void imprimir() {
		System.out.print("Resultados:\nSuma: "+suma()+"\nResta: "+resta()+"\nMultiplicación: "+multi()+"\nDivisión: "+div());
	}	
	public static void main(String[]ar) {
		Operaciones calcu1;
		calcu1 = new Operaciones();
		calcu1.ingreso();
		calcu1.imprimir();
	}
}