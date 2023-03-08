package ejercicio_4;

public class TestTransferencia {

public static void main(String[] args) {
		
		Cuenta cuenta01 = new Cuenta(1,01);
		cuenta01.depositar(23500);
		
		System.out.println("El saldo de la cuenta 01 es $ "+cuenta01.getSaldo());
		
		System.out.println("-----------------------------------------");
		
		Cuenta cuenta02 = new Cuenta(2,02);
		cuenta02.depositar(1500);
		System.out.println("El saldo de la cuenta 02 es $ "+cuenta02.getSaldo());
		
		boolean puedeTransferir = cuenta02.transferir(400, cuenta01);
		
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No es posible");
		}
		
		System.out.println(cuenta02.getSaldo());
		System.out.println(cuenta01.getSaldo());
	}

}
