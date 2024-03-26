package ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

//Calcula la media de los números que se encuentran en un fichero de texto
public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del archivo donde se encuentran los números: ");
		String nombreArchivo = p.nextLine();
		
		try {
		
			BufferedReader archivo = new BufferedReader(new FileReader(nombreArchivo)); //D:\\Users\\Brenda\\Desktop\\Clase4\\numeros.txt
			
			String linea = "0";
			int i = 0;
			double suma = 0;
			
			while(linea != null) {
				i++;
				suma+=Double.parseDouble(linea);
				linea=archivo.readLine();
			}
			i--;
			archivo.close();
			
			System.out.println("La media es " + suma / (double)i);
		
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
