package ejercicio_7;

//solo nos interesa saber la capacidad máxima y los litros que contiene el cubo en cada
//momento
public class Cubo {

	int capacidad;
	int contenido;
	
	public Cubo(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	
	public void vacio() {
		this.contenido = 0;
	}
	
	public void lleno() {
		this.contenido = this.capacidad;
	}
	
	//Pinta el cubo en la pantalla.
	//Se muestran los bordes del cubo con el carácter # y el
	//agua que contiene con el carácter ~.
	
	public void pinta() {
		for(int nivel = this.capacidad; nivel>=0;nivel--) {
			if(this.contenido >= nivel) {
				System.out.println("#~~~~#");
			}else {
				System.out.println("#    #");
			}
		}
		System.out.println("######");
	}
	
	
	
}
