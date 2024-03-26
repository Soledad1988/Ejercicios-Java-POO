package arrayList;

import java.util.ArrayList;

//Ejemplo de uso de la clase ArrayList con numeros enteros
public class Ejercicio_2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(18);
		numeros.add(22);
		numeros.add(-30);
		
		System.out.println("N° de elementos: "+numeros.size());
		System.out.println("El elemneto en la posicion 1 es: "+numeros.get(1));
	}
}
