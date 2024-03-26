package ejercicios41_50;

//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
public class Ejercicio_41 {

	public static void main(String[] args) {
		
		int multiplo = 5;
	
		for(int i=0;i<=100;i++ ) {

			if(i % multiplo == 0) {
				System.out.println(i);
			}
		}
	}
}
