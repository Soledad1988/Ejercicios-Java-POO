package ejercicios11_20;

import java.io.IOException;

//Leer un string del teclado y luego mostrarlo en la pantalla
public class Ejercicio_13 {

	public static void main(String[] args) throws IOException{
		
		int  c;
		String x;
		x = "";
		
		System.out.println("Ingrese un string ");
		while( (c=System.in.read()) != '\n')  //'\n' enter 
			x=x+(char)c;
		
		System.out.println("La cadena es " + x);
	}
}
