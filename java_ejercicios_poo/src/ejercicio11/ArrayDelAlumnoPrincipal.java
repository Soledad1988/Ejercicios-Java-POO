package ejercicio11;

import java.util.Scanner;

public class ArrayDelAlumnoPrincipal {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
	
	//A continuación se define un array de cinco alumnos que posteriormente se rellena.
	//Por último se muestran los datos de los alumnos por pantalla.
	//Observa que la siguiente línea únicamente define la estructura del array pero no crea
	//los objetos:
	
	Alumno[] alum = new Alumno[5];
	
	//Cada objeto concreto se crea de forma individual mediante

	//alum[i] = new Alumno();
	
	System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumno\s.");
			String nombreIntroducido;
			double notaIntroducida;
			
			for(int i =0;i<alum.length;i++) {
				
				alum[i] = new Alumno();
				
				nombreIntroducido = p.next();
				alum[i].setNombre(nombreIntroducido);
				
				notaIntroducida = p.nextDouble();
				alum[i].setNotaMedia(notaIntroducida);
			}//for i
			
			
			// Muestra los datos de los alumnos /////////////////////////////////
			System.out.println("Los datos introducidos son los siguientes:");
			double sumaDeMedias = 0;
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Alumno " + i);
				System.out.println("Nombre: " + alum[i].getNombre());
				System.out.println("Nota media: " + alum[i].getNotaMedia());
				System.out.println("----------------------------");
				sumaDeMedias += alum[i].getNotaMedia();
			} // for i
			System.out.println("La media global de la clase es " + sumaDeMedias / 5);
}
}