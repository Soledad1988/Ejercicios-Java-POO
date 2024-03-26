package ejercicios31_40;

import java.util.Scanner;

/**
* Bucle do-while que termina cuando se introduce por teclado un
* número impar.
*/
public class Ejercicio_40 {
	
	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Ingrese un número: ");
			num = p.nextInt();
			
			if(num%2 ==0) { //comprueba si en número ingresado es par
				System.out.println("Que bonito es el número par: "+num);
			}else {
				System.out.println("No me gustan los números impares: "+num);
			}
		} while(num %2==0);
		
	}
}
