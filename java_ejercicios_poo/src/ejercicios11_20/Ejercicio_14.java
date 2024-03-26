package ejercicios11_20;

import java.io.IOException;

//Leer un números del teclado y mostrarlo en pantalla
public class Ejercicio_14 {

	
	public static void main(String[] args) throws IOException{
		
		int c;
		String x = "";
		int numero;
		
		System.out.println("ingrese un numero por favor ");
		
		while( (c=System.in.read()) !='\n')
			x=x+(char)c;
		
		numero = Integer.parseInt(x.trim()); //convierte cadena a numero
		System.out.println("El numero es " + numero);
	}
}
