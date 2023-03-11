package ejercicio_8;

public class Ave extends Animal{

	public Ave() {
		super();
	}

	public Ave(Sexo s) {
		super(s);
	}
	
	//hacer que el ave se limpie
	public void aseate() {
		System.out.println("Me estoy limpiando las plumas");
	}
	
	//hacer que al ave vuele
	public void vuela() {
		System.out.println("Estoy volando"+ "\n*************************\n");
	}

	
}
