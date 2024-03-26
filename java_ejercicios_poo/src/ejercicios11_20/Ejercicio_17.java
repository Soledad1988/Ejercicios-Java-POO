package ejercicios11_20;

//Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
//los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
//el valor de cada variable, la suma, la resta, la división y la multiplicación.
public class Ejercicio_17 {

	public static void main(String[] args) {
		
		int x = 144;
		int y = 999;
		
		System.out.println("Las variables son: " + x + " e "+ y);
		
		//suma
		int suma = x + y;
		System.out.println("la suma de las variables es: "+ suma);
		
		//resta
		int resta = y - x;
		System.out.println("la resta de las variables es: "+ resta);
		
		//multiplicacion
		int multiplicacion = x * y;
		System.out.println("la multiplicacion de las variables es: "+ multiplicacion);
		
		//division
		double division = (double) y / (double) x;
		System.out.println("la division de las variables es: "+ division);
	}
}
