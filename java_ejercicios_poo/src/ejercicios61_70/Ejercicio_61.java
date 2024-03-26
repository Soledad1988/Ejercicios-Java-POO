package ejercicios61_70;

import java.util.Scanner;

//Funciones
//calcular si un numero es primo

public class Ejercicio_61 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Ingrese un número ");
		int n = p.nextInt();
		
		if(esPrimo(n)) {
			System.out.println("El número "+n+" es primo.");
		}else {
			System.out.println("El número "+n+" es no primo.");
		} }
	
	
		
		//FUNCION
		
				public static boolean esPrimo(int x){
					for(int i=2; i<x;i++) {
						if((x%i)==0) {
							return false;
						}
					}
					return true;
				}
}  
		
