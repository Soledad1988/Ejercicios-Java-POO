package ficheros;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

//Ficheros: escritura y lectura combinadas
public class Ejercicio_4 {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader fichero1 = new BufferedReader(new FileReader("D:\\Users\\Brenda\\Desktop\\PruebasGit-UTN\\fichero1.txt"));
			BufferedReader fichero2 = new BufferedReader(new FileReader("D:\\Users\\Brenda\\Desktop\\PruebasGit-UTN\\fichero2.txt"));
			BufferedWriter combinado = new BufferedWriter(new FileWriter("D:\\Users\\Brenda\\Desktop\\PruebasGit-UTN\\PruebaGit.txt"));
			
			String linea1="";
			String linea2="";
			
			while((linea1 !=null)||(linea2 != null)) {
				linea1 = fichero1.readLine();
				linea2 = fichero2.readLine();
				
				if(linea1!=null) {
					combinado.write(linea1 + "\n");
				}
				
				if(linea2!=null) {
					combinado.write(linea2 + "\n");
				}
						
			}
			fichero1.close();
			fichero2.close();
			combinado.close();
			System.out.println("Archivo combinado.txt creado satisfactoriamente.");
		}catch (IOException ioe){
			System.out.println("Se ha producido un error de lectura/escritura");
			System.err.println(ioe.getMessage());
			
		}
	}
}
