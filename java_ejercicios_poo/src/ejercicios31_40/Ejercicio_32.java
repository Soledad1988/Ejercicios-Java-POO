package ejercicios31_40;

import java.util.Scanner;

//sentencia Switch
//Se pide al usuario un número de
//mes y el programa da el nombre del mes que corresponde a ese número.
public class Ejercicio_32 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		System.out.print("Por favor introduzca un número de mes: ");
		
		int mes = p.nextInt();
		String nombreDelMes;
		
		switch(mes) {
		case 1:
			nombreDelMes = "Enero";
			break;
		case 2:
			nombreDelMes = "Febrero";
			break;
		case 3:
			nombreDelMes = "Marzo";
			break;
		case 4:
			nombreDelMes = "Abril";
			break;
		case 5:
			nombreDelMes = "Mayo";
			break;
		case 6:
			nombreDelMes = "Junio";
			break;
		case 7:
			nombreDelMes = "Julio";
			break;
		case 8:
			nombreDelMes = "Agosto";
			break;
		case 9:
			nombreDelMes = "Septiembre";
			break;
		case 10:
			nombreDelMes = "Octubre";
			break;
		case 11:
			nombreDelMes = "Noviembre";
			break;
		case 12:
			nombreDelMes = "Diciembre";
			break;
		default:
			nombreDelMes = "no existe ese mes";
		}
		
		System.out.println("Mes "+mes+": "+ nombreDelMes);
	}
	
}
