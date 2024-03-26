package ejercicios31_40;

import java.util.Scanner;

//El usuario introducirá un número por
//teclado y el programa dirá si se trata de un número positivo o negativo.
public class Ejercicio_30 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		System.out.print("Por favor ingrese un número entero: ");
		
		int numero = p.nextInt();
		
		if(numero<0) {
			System.out.println("El número ingresado es negativo.");
		}else {
			System.out.println("El número ingresado es positivo.");
		}
	}
}
