package ejercicio_10;

public class Gato extends Animal implements Mascota{ //se implementan los metodos de manera automatica

	private String codigo;
	
	public Gato (Sexo s, String c) {
		super(s);
		this.codigo = c;
		}

	@Override
	public String getCodigo() {
		return this.codigo;
	}

	@Override
	public void hazRuido() {
		this.maulla();
		this.ronronea();
	}
	
	//Hace que el gato maulle.
	public void maulla() {
	System.out.println("Miauuuu");
	}
	
	//Hace que el gato ronronee
	public void ronronea() {
	System.out.println("mrrrrrr");
	}


	@Override
	public void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Hmmmm, gracias");
			} else {
			System.out.println("Lo siento, yo solo como pescado");
			}

		
	}

}
