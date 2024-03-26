package ejercicios31_40;

import java.io.IOException;
import java.util.Scanner;

//operadores logicos - notas
//Mediante if ((n <
//1) || (n > 100)) se pueden detectar los números que no están en el rango de 1 a 100;
//literalmente sería “si n es menor que 1 o n es mayor que 100”.

public class Ejercicio_31 {

	public static void main(String[] args){
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Adivina el numero que stoy pensando!");
		System.out.print("Introduce un número del 1 al 100 ");
		
		int numero = p.nextInt();
		
		if ((numero < 1) || (numero > 100)){
			System.out.println("El número intruducido debe estar en el rando 1 - 100");
			System.out.print("Tienes otra oportunidad, ingresa un número ");
			numero = p.nextInt();
		}
		
		if (numero == 24) {
			System.out.println("Has acertado");
		}else {
			System.out.println("Lo siento, no es el número que estoy pensando");
		}
	}
}
