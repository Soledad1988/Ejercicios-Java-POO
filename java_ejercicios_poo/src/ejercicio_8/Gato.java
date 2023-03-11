package ejercicio_8;

public class Gato extends Animal{
	
	private String raza;

	//constructor instancia con parametros
	public Gato(Sexo s, String r) {
		super(s);
		raza = r;
	}


	//constructor instancia simple
	public Gato(Sexo s) {
		super(s);
		raza="siamés";
	}
	
	public Gato(String r) {
		super(Sexo.HEMBRA);
		raza=r;
	}

	public Gato() {
		super(Sexo.HEMBRA);
		raza="siamés";
	}
	
	
	
	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String toString() {
		return super.toString()
		+ "Raza: " + this.raza
		+ "\n*************************\n";
	}
	
	//Hace que el gato maulle
		public void maulla() {
			System.out.println("Miauuuu");
		}
		
		//Hace que el gato ronronee
		public void ronronea() {
			System.out.println("mrrrrrr");
		}

		//hacer que el gato coma, a los gatos les gusta el pescado
		//si es otro alimento lo rechaza
		
		public void come(String comida) {
			if(comida.equals("pescado")) {
				System.out.println("Hmmmmm, gracias!!");
			}else {
				System.out.println("Yo solo como pescado :)");
			}
		}

	
	
}
