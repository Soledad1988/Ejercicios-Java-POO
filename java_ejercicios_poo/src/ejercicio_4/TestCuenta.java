package ejercicio_4;

public class TestCuenta {

public static void main(String[] args) {
		
		Cuenta cuenta01 = new Cuenta(1,01);
		
		cuenta01.setSaldo(15000);
		
		System.out.println("Se ha creado la cuenta N° "+cuenta01.getNumero());
		
		System.out.println("Posee un saldo de $ "+ cuenta01.getSaldo());
		
	}
}
