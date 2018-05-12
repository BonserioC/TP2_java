package Ejercicio4;

public class Tabla{	
	public static void main(String[]ar) {
		int r = 0; //resultado
		int m = 1; //multiplicador
				
		System.out.print("Tabla del 5 (hasta el 50):\n");
		while (r < 50) {
			r = 5 * m;
			System.out.println("5 x " +m+" = " +r);
			m++;			
		}
	}
}