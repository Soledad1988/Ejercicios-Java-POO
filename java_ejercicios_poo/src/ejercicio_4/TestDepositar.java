package ejercicio_4;

public class TestDepositar {

public static void main(String[] args) {
		
		Cuenta cuenta01 = new Cuenta(1,01);
		cuenta01.getSaldo();
		
		System.out.println("El saldo de mi cuenta es $ "+cuenta01.getSaldo());
		
		cuenta01.depositar(25300);
		
		System.out.println("El saldo de mi cuenta es $ "+cuenta01.getSaldo());
	}
}
