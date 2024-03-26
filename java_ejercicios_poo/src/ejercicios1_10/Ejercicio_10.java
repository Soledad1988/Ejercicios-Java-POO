package ejercicios1_10;


//Hallar la suma y multiplicación de los 5 números consecutivos a partir del numero 7. Es decir: 
//7+8+9+10+11 = 45 y 7*8*9*10*11= 55440
public class Ejercicio_10 {

	public static void main(String[] args) {
		
		int numero;
		int suma = 0;
		int multiplicacion = 1;
		
		
		for(numero=0;numero<5;numero++) {
			suma = suma +(numero+7);
			multiplicacion = multiplicacion *(numero+7);
			
			System.out.println(suma);
			System.out.println(multiplicacion);
		}
	}
}
