package ejercicios11_20;

import java.io.IOException;

//Leer dos números del teclado y presentar el numero mayor en pantalla
public class Ejercicio_15 {
	
	public static void main(String[] args) throws IOException{
		
		int c;
		String x = "";
		int numero1;
		int numero2;
		
		System.out.println("ingrese un numero por favor ");
		
		while( (c=System.in.read()) !='\n')
			x=x+(char)c;
		
		numero1 = Integer.parseInt(x.trim()); //convierte cadena a numero
		x="";
		
		System.out.println("ingrese otro numero por favor ");
		
		while( (c=System.in.read()) !='\n')
			x=x+(char)c;
		
		numero2 = Integer.parseInt(x.trim()); //convierte cadena a numero
		
		if(numero1>numero2) {
			System.out.println("El "+numero1+" es mayor que "+numero2);
		}else {
			System.out.println("El "+numero2+" es mayor que "+numero1);
		}
		
	}

}
