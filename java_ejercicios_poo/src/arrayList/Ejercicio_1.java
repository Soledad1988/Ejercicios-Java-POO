package arrayList;

import java.util.ArrayList;

//Ejemplo de uso de la clase ArrayList
public class Ejercicio_1 {

	public static void main(String[] args) {
		
		ArrayList<String> colores = new ArrayList<String>();
		
		System.out.println("Numero de elementos: "+ colores.size());
		
		//agregar elementos
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		
		System.out.println("Numero de elementos: "+ colores.size());
		
		colores.add("Blanco");
		
		System.out.println("Numero de elementos: "+ colores.size());
		
		System.out.println("El elemento que hay en la poscion 0 es: "+ colores.get(0));
		System.out.println("El elemento que hay en la poscion 3 es: "+ colores.get(3));
	}
}
