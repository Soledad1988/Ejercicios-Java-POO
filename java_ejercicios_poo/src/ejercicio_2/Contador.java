package ejercicio_2;

public class Contador {
	public int cont;

	//constructor por defecto
	public Contador() {
	
	}
	
	//contructor con parametros para inicializar
	// el contador con valores no negativos
	public Contador(int cont) {
		this.cont = cont;
		if(cont <0) {
			this.cont = 0;
		}
	}

		
	//metodos getter y setter
	
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	//metodo incrementar
	public void incrementar() {
		cont++;
	}
	
	//metodo decrementar
	public void decrementar() {
		cont--;
		if(cont<0) {
			cont = 0;
		}
	}
}
