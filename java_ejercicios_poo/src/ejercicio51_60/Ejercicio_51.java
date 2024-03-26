package ejercicio51_60;

//Vamos a producir ahora de forma aleatoria una palabra - piedra, papel o
//tijera - generando primero un número entero entre 0 y 2 y posteriormente haciendo
//corresponder una palabra a cada número.
public class Ejercicio_51 {

	public static void main(String[] args) {
		
		System.out.println("Genera al azar piedra, papel o tijera:");
		
		int mano = (int)(Math.random()*3); // genera un número al azar
		                                    // entre 0 y 2 ambos incluidos
		switch(mano) {
		
		case 0:
			System.out.println("pieda");
			break;
			
		case 1:
			System.out.println("papel");
			break;
		
		case 2:
			System.out.println("tijera");
			break;
			
		default:
		}
				
	}
}
