package ejercicio_1;

public class EjecutableCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Mariel");
		Cuenta cuenta2 = new Cuenta ("Gimena, 150");
		
		//ingresamos dinero
		cuenta1.ingresar(1000);
		cuenta2.ingresar(500);
		
		//retiramos dinero
		cuenta1.retirar(1000);
		cuenta2.retirar(250);
		
		//mostramos informacion en consola
		System.out.println(cuenta1);
		System.out.println(cuenta2);
	}
}
