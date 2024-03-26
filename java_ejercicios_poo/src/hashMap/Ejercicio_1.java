package hashMap;

import java.util.HashMap;

//Ejemplo de uso de la clase HashMap
public class Ejercicio_1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(924, "Amalia Núñez");
		m.put(921, "Cindy Nero");
		m.put(700, "César Vázquez");
		m.put(219, "Víctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		
		System.out.println("Los elementos de m son: \n" + m);
	
		//Para extraer valores se utiliza el método get. Se proporciona una clave y el diccionario
		//nos devuelve el valor, igual que un diccionario de verdad. Si no existe ninguna entrada
		//con la clave que se indica, se devuelve null.
		System.out.println("\nSe etraen los stes valores: ");
		System.out.println(m.get(921));
		System.out.println(m.get(605));
		System.out.println(m.get(888));

	}
}
