package arrayList;

import java.util.ArrayList;

//como extraer los elementos de un ArrayList
public class Ejercicio_3 {

	public static void main(String[] args) {
		
		ArrayList<String> colores = new ArrayList<String>();
		
		//agregar elementos
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		colores.add("Blanco");
		colores.add("Amarillo");
		
		//recorremos elementos con un For
		for(int i=0;i<colores.size();i++) {
			System.out.println(colores.get(i));
		}
		
		//recorrer elementos con un ForEach
		System.out.println("\nContenido de la lista: ");
		for(String color:colores) {
			System.out.println(color);
		}
	}
}
