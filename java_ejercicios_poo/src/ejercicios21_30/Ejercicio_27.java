package ejercicios21_30;

import java.util.Scanner;

//Escribe un programa que calcule el total de una factura a partir de la base
//imponible con un IVA del 21%
public class Ejercicio_27 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		System.out.print("Por favor ingrese la base imponible: ");
		
		double baseImponible = p.nextDouble();
		
		double iva = 0.21;
		
		double calculoIva = baseImponible * iva ;
		
		double totalFactura = baseImponible + calculoIva;
		
		System.out.println("El total de la factura es: "+totalFactura);
	}
}
