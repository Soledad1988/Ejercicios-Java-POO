package ejercicios61_70;
import matematicas.Varias;

import java.util.Scanner;

//prueba de funciones
public class Ejercicio_62 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número posistivo: ");
		int n = p.nextInt();
		
		if(matematicas.Varias.esPrimo(n)) {
			System.out.println("El número "+n+" es primo");
		}else {
			System.out.println("El número "+n+" no es primo");
		}
	}
}
