package ejercicio_6;

public class PruebaGatoSimple {

	public static void main(String[] args) {
		
		gatoSimple tom = new gatoSimple("macho");
		
		System.out.println("Hola gatito");
		tom.maulla();
		System.out.println("Tienes habre?...veremos que hay de comer..");
		tom.ronronea();
		System.out.println("tarta de carne");
		tom.come("tarta de carne");
	}
}
