package ejercicios41_50;

//numeros aleatorios Math.random()
public class Ejercicio_48 {

	public static void main(String[] args) {
		
		System.out.println("20 números aleatorios entre 0 y 9 (sin decimales):");
		
		for(int i = 1; i <= 20; i++) {
			System.out.print((int)(Math.random()*10) + " ");
		}
		
		System.out.println();
	}
}
