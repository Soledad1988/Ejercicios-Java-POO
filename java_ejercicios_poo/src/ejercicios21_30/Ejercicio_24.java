package ejercicios21_30;

import java.util.Scanner;

//Realiza un programa que pida dos números y que luego muestre el resultado
//de su multiplicación.

public class Ejercicio_24 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese 2 numeros separados por un espcio: ");
		
		int numero1 = s.nextInt();
		int numero2 = s.nextInt();
		
		int multiplicacion = numero1 * numero2;
		
		System.out.println("El resultado de la multiplicación de ambos números es: " + multiplicacion);
	}
}
