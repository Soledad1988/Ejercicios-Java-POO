package ejercicio_4;

public class TestRetirar {

public static void main(String[] args) {
		
		Cuenta cuenta01 = new Cuenta(1,01);
		cuenta01.depositar(23500);;
		
		System.out.println("El saldo de mi cuenta es $ "+cuenta01.getSaldo());
		
		cuenta01.retirar(1500);
		
		System.out.println("El saldo de mi cuenta es $ "+cuenta01.getSaldo());
	}
}
