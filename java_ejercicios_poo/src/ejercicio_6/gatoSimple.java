package ejercicio_6;

//definicion clase gato simple
public class gatoSimple {

	//atributos
	String color;
	String raza;
	String sexo;
	int edad;
	double peso;
	
	//metodos
	
	//constructor
	public gatoSimple(String s) {
		this.sexo = s;
	}
	
	//Getter
	String getSexo() {
		return this.sexo;
	}
	
	//Hace que el gato maulle
	public void maulla() {
		System.out.println("Miauuuu");
	}
	
	//Hace que el gato ronronee
	public void ronronea() {
		System.out.println("mrrrrrr");
	}

	
}
