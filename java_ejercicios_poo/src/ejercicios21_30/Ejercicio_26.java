package ejercicios21_30;

import java.util.Scanner;

//Realiza un conversor de euros a pesos. La cantidad de euros que se quiere
//convertir debe ser introducida por teclado.
public class Ejercicio_26 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		double euro = 206.63; //26/02/2023
		
		System.out.print("Por favor ingrese moto en pesos a convertir ");
		
		double pesos = p.nextDouble();
		
		double conversor = pesos/euro;
		
		System.out.println("$"+pesos + " pesos equivalen a " +"EUR "+ conversor + " a la fecha xx/xx/xx");
	}
}
