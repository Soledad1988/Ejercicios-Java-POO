package ejercicio51_60;

//¿Cómo podríamos generar un día de la semana de forma aleatoria? En efecto, primero
//generamos un número entre 1 y 7 ambos inclusive y luego hacemos corresponder un
//día de la semana a cada uno de los números.
public class Ejercicio_52 {

	public static void main(String[] args) {
		System.out.println("Genera de manera aleatoria un dia de la semana: ");
		
		int dia = (int)(Math.random()*7+1);
		
		switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		
		case 2:
			System.out.println("Martes");
			break;
			
		case 3:
			System.out.println("Miércoles");
			break;
			
		case 4:
			System.out.println("Jueves");
			break;
			
		case 5:
			System.out.println("Viernes");
			break;
			
		case 6:
			System.out.println("Sabado");
			break;
			
		case 7:
			System.out.println("Domingo");
			break;
		
		default:
		}
	}
}
