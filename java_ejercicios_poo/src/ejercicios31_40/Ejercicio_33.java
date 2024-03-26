package ejercicios31_40;

import java.util.Scanner;

//menu con switch
public class Ejercicio_33 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		System.out.println(" CÁLCULO DE ÁREAS ");
		System.out.println("------------------");
		System.out.println("1 - Cuadrado");
		System.out.println("2 - Rectangulo");
		System.out.println("3 - Triangulo");
		System.out.print("\n Elija una opción (1-3): ");
		
		int opcion = p.nextInt();
		
		double lado;
		double base;
		double altura;
		
		switch(opcion) {
		case 1:
			System.out.print("\nIngrese el área del cuadrado en cm ");
			lado = p.nextDouble();
			System.out.println("\nEl área del cuadrado es: "+(lado*lado)+" cm2.");
		break;
		
		case 2:
			System.out.print("\nIngrese la base del rectangulo en cm ");
			base = p.nextDouble();
			System.out.print("\nIngrese la altura del rectangulo en cm ");
			altura = p.nextDouble();
			System.out.println("\nEl área del rectángulo es: "+(base*altura)+" cm2.");
		break;
		
		case 3:
			System.out.print("\nIngrese la base del triángulo en cm ");
			base = p.nextDouble();
			System.out.print("\nIngrese la altura del triángulo en cm ");
			altura = p.nextDouble();
			System.out.println("\nEl área del triángulo es: "+((base*altura)/2)+" cm2.");
		break;
		
		default:
			System.out.print("\nLo siento, la opción elegida no es correcta.");
		}
	}
}
