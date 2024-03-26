package ejercicios1_10;


//Escribir un programa que obtenga el factorial de 7. Es decir: 1*2*3*4*5*6*7 = 5040 
public class Ejercicio_7 {

	public static void main(String[] args) {
		
		int numero;
		int k=1;
		
		for(numero = 1; numero<=7; numero++  ) {
			k = k*numero;
			System.out.println(k);
		}
	}
}
