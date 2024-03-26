package ejercicios11_20;

//Escribe un programa que calcule el total de una factura a partir de la base
//imponible (precio sin IVA). La base imponible estará almacenada en una
//variable.

public class Ejercicio_19 {
	public static void main(String[] args) {
	
		double baseImponible = 1000;
		double iva = 0.21;
		double calculoIva = baseImponible * iva;
		double totalFactura = baseImponible + calculoIva;
		
		System.out.println("El total de la factura es: "+totalFactura);
		
	}
}
