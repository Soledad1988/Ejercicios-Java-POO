package ejercicios31_40;

import java.util.Scanner;

//Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.

public class Ejercicio_35 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		System.out.print("Por favor introduzca un número del dia: ");
		
		int dia = p.nextInt();
		String nombreDia;
		
		switch(dia) {
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miércoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sabado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;
	
		default:
			nombreDia = "no existe ese día";
		}
		
		System.out.println("Dia " + dia + ": " + nombreDia);
	}
}
