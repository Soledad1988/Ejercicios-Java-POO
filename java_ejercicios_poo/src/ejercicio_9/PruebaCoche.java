package ejercicio_9;

public class PruebaCoche {

	public static void main(String[] args) {
		
		Coche cocheDiego = new Coche("saab","93",0);
		Coche cocheJose = new Coche("Toyota","avenis",0);
		
		cocheDiego.recorre(30);
		cocheDiego.recorre(40);
		cocheDiego.recorre(220);
		
		cocheJose.recorre(60);
		cocheJose.recorre(120);
		cocheJose.recorre(90);
		
		System.out.println("El coche de Diego ha recorrido "+cocheDiego.getKilometraje()+" Km.");
		System.out.println("El coche de Jose ha recorrido "+cocheJose.getKilometraje()+" Km.");
		System.out.println("El kilometraje total ha sifo "+Coche.getKilometrajeTotal()+" Km.");
		//El método getKilometrajeTotal() se aplica a la clase Coche por tratarse de un método de
		//clase (método static). Este método no se podría aplicar a una instancia, de la misma
		//manera que un método que no sea static no se puede aplicar a la clase sino a los objetos.
	}
}
