package ejercicios21_30;

import java.util.Scanner;
//Escribe un programa que sume, reste, multiplique y divida dos números
//introducidos por teclado.

public class Ejercicio_25 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese 2 numeros separados por un espcio: ");
		
		double numero1 = s.nextDouble();
		double numero2 = s.nextDouble();
		
		double suma = numero1 + numero2;
		
		double resta = numero1 - numero2;
		
		double multiplicacion = numero1*numero2;
		
		double division = numero1/numero2;
		
		System.out.println("Los numeros ingresados son: "+numero1+" y "+numero2);
		System.out.println("La suma de ambos numeros es: "+suma);
		System.out.println("La resta de ambos numeros es: "+resta);
		System.out.println("La multiplicación de ambos numeros es: "+multiplicacion);
		System.out.println("La división de ambos numeros es: "+division);
	}
}
