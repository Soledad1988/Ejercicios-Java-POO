package ejercicio_7;

public class PruebaCubo {

	public static void main(String[] args) {
		
		Cubo cubito = new Cubo(2);
				
		System.out.println("Cubito: \n");
		cubito.pinta();
			
		System.out.println("\nLlena el cubito: \n");
		cubito.lleno();
		cubito.pinta();
		
	}
}
