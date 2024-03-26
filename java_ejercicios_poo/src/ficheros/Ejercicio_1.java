package ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
//lectura de un fichero de texto
public class Ejercicio_1 {

	public static void main(String[] args) {
		
		try {
		
			BufferedReader archivo = new BufferedReader(new FileReader("D:\\Users\\Brenda\\Desktop\\PruebasGit-UTN\\PrubaGit.txt"));
			String linea = "";
			
			while(linea != null) {
				System.out.println(linea);
				linea = archivo.readLine();
				archivo.close();
			}
			
		}catch(FileNotFoundException f) {
			
			System.out.println("No se encuentra el fichero");
		}catch(IOException ex) {
			System.out.println("No se puede leer el fichero");
		}
	}
}
