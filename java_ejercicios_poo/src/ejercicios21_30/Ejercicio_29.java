package ejercicios21_30;

import java.util.Scanner;

//el usuario debe responder a la pregunta
//que le hace el ordenador.
public class Ejercicio_29 {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);
		
		System.out.print("¿Cual es la capital de Brasil?: ");
		
		String capital = p.next();
		
		if(capital.equals("Brasilia")) {
			System.out.println("¡La respuesta es correcta!");
		}else {
			System.out.println("¡Lo siento!, la respuesta es incorrecta.");
		}
	}
}
