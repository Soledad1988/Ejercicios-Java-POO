package arrayList;

import java.util.ArrayList;

//Eliminar elementos de un ArrayList
public class Ejercicio_4 {

	public static void main(String[] args) {
		
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		colores.add("Blanco");
		colores.add("Amarillo");
		colores.add("Blanco");
		
		System.out.println("Contenido de la lista: ");
		//recorro con un ForEach
		for(String color:colores) {
			System.out.println(color);
		}
		
		//saber si el array list contiene ese elemento
		if(colores.contains("Blanco")) {
			System.out.println("\nEl blanco esta en la lista de colores");
		}
		
		//remuevo un elemnto de la lista
		colores.remove("Blanco");
		System.out.println("\nContenido de la lista luego de eliminar un elemento: ");
		for(String color:colores) {
			System.out.println(color);
		}
		
		//remover elemneto con el indice
		colores.remove(2);
		System.out.println("\nContenido de la lista después de quitar el " +
		"elemento de la posición 2: ");
		
		for(String color: colores) {
		System.out.println(color);
		}

	}
}
