package ejercicios31_40;

import java.util.Scanner;

/**
* Bucle while que termina cuando se introduce por teclado un
* número negativo.
*/
public class Ejercicio_38 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		System.out.println("Por favor ingrese un número: ");
		System.out.println("Para terminar ingrese un número negativo: ");
		
		int numeroIngresado=0;
		int contador = 0;
		int suma =0;
		
		while(numeroIngresado>=0) {
			numeroIngresado = p.nextInt();
			contador++; //incrementa en uno la variable
			
			suma += numeroIngresado;
			
		}
		
		System.out.println("Has introducido "+ (contador - 1) + " numeros positivos");
		System.out.println("la suma total de ellos es "+(suma - numeroIngresado));
		
	}
}
