package ejercicio_8;

public class Pinguino extends Ave{

	public Pinguino() {
		super();
	}

	public Pinguino(Sexo s) {
		super(s);
	}

	@Override
	public void vuela() {
		System.out.println("No puedo volar :(");
	}
	
	

	
	
}
