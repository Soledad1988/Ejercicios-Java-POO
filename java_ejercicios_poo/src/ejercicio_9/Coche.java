package ejercicio_9;

public class Coche {
	
	private String marca;
	private String modelo;
	private int kilometraje; //almacena los kilómetros recorridos por un objeto concreto y tendrá un valor distinto para cada uno de ellos.
	
	//almacena el número total de kilómetros que recorren todos los objetos de la clase Coche
	private static int kilometrajeTotal = 0; //, es un único valor, por eso se declara como static

	
	public Coche() {
		
	}
	

	public Coche(String marca, String modelo, int kilometraje) {
		this.marca = marca;
		this.modelo = modelo;
		kilometraje = 0;
	}


	//metodo de clase
	public static int getKilometrajeTotal() {
		return kilometrajeTotal;
	}


	public static void setKilometrajeTotal(int kilometrajeTotal) {
		Coche.kilometrajeTotal = kilometrajeTotal;
	}
	
	
	public int getKilometraje() {
		return kilometraje;
		}
	
	//Recorre una determinada distancia.
	public void recorre(int km) {
		kilometraje += km;
		kilometrajeTotal += km;
		}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	
	
}
