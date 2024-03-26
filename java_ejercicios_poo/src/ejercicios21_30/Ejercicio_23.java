package ejercicios21_30;

import java.util.Scanner;

//Calcular la media de 3 numeros decimales
public class Ejercicio_23 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce tres números (pueden contener decimales) separados por espacio\s: ");

		double numero1 = s.nextDouble();
		double numero2 = s.nextDouble();
		double numero3 = s.nextDouble();
		
		double media = (numero1 + numero2 + numero3)/3;
		
		System.out.println("La media de esos tres numeros es: "+ media);
	}

}
