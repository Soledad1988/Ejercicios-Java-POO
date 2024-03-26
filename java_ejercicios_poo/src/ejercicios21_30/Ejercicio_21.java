package ejercicios21_30;

import java.util.Scanner;

//Lectura de datos desde teclado usando la clase Scanner

public class Ejercicio_21 {

	
	public static void main(String[] args) {
		
		    Scanner nb = new Scanner(System.in);
			System.out.print("Por favor, ingrese su nombre: ");
			
			String nombre = nb.nextLine();
			
			System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");
		
	}
}
