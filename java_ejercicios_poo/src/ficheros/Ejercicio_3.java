package ficheros;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

//Escritura de ficheros
public class Ejercicio_3 {

	public static void main(String[] args) {
		
		try {
			BufferedWriter archivo = new BufferedWriter(new FileWriter("D:\\Users\\Brenda\\Desktop\\PruebasGit-UTN\\PrubaGit.txt"));
			
			archivo.write("prueba escritura");
			
			archivo.close();
		}catch(IOException ex) {
			System.out.println("No se ha podido escribir en el fichero");
		}
		
	}
}
