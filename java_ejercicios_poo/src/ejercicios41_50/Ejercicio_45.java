package ejercicios41_50;

import java.util.Scanner;

//Muestra la tabla de multiplicar de un número introducido por teclado.
public class Ejercicio_45 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un número: ");
		int numero = p.nextInt();
		System.out.println("Tabla del " + numero);
		for(int i=0;i<=10;i++) {
			System.out.println(numero + " * " + i + " = " + numero*i);  
		}
	}
}
