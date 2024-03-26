package ejercicios1_10;

public class Ejercicio_8 {

//Escribir un programa que obtenga la suma de los 35 primeros números. Es decir: 
//	1+2+...+34+35 = 630
	
	public static void main(String[] args) {
		int suma = 0;
		for(int numero = 0; numero <=35; numero++) {
			suma = suma + numero;
			System.out.println(suma);
		}
			
	}
}


