package ejercicio51_60;

import java.util.Scanner;

//usos de arrays
public class Ejercicio_54 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		// definición del array y reserva de memoria en la misma línea
		
		int[] x = new int [5];
		
		x[0]= 8;
		x[1]= 33;
		x[2]= 200;
		x[3]= 150;
		x[4]= 11;
		
		System.out.println("El array x tiene tiene 5 elementos, ¿Cuál de ellos quiere ver?");
		System.out.println("Introduzaca un número del 0 al 4: ");
		int indice = p.nextInt();
		System.out.println("El elemento que se encentra en la posicion "+indice);
		System.out.println("es el "+x[indice]);
		
	}
}
