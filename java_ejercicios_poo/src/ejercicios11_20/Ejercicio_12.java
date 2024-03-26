package ejercicios11_20;

import java.io.IOException;

//Leer un carácter del teclado y luego mostrarlo en la pantalla. 
public class Ejercicio_12 {

	public static void main(String[] args) throws IOException{
	
		char caracter;
		System.out.println("Ingrese un caracter por favor ");
		
		caracter = (char)System.in.read(); //lee un caracter del teclado
		
		System.out.println("El caracter ingresa es: " + caracter);
		
	}
}
