package ejercicios21_30;

import java.util.Scanner;

//Lectura de datos desde teclado usando la clase Scanner

public class Ejercicio_22 {

	public static void main(String[] args) {
		
		Scanner nb = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un numero: ");
		
		int numero1 = nb.nextInt();
		
		System.out.println("Por favor ingrese otro numero: ");
		
		int numero2 = nb.nextInt();
		
		int total = (numero1 * 2) + numero2;
		
		System.out.println("El primer numero ingresado es: "+ numero1);
		System.out.println("El segundo es: "+ numero2);
		
		System.out.println("El dobre del primer numero mas la suma del segundo es: "+ total);
	}
}
