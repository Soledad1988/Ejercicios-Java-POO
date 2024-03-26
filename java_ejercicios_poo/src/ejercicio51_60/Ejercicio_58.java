package ejercicio51_60;

// Ejemplo de uso de arrays bidimensionales
public class Ejercicio_58 {

	public static void main(String[] args) throws InterruptedException{
		
		int fila, columna;
		int [][] n = {{20,4},{67,33},{0,7}}; //Los valores del array bidimensional se pueden proporcionar en la misma línea de la definición
		
		for(fila=0;fila<3;fila++) {
			System.out.println("Fila "+fila);
			
			for(columna=0;columna<2;columna++) {
				System.out.printf("%10d ", n[fila][columna]);
				Thread.sleep(1000); //retardo en segundos
			}
			System.out.println();
		}
	}
}
