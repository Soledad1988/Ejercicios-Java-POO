package ejercicio_8;

public class PruebaAnimal {

	public static void main(String[] args) {
		
		Gato negro = new Gato(Sexo.MACHO, "romano");
		Gato tom = new Gato(Sexo.MACHO);
		Gato lisa = new Gato(Sexo.HEMBRA);
		Gato silvestre = new Gato();
		
		System.out.println(negro);
		System.out.println(tom);
		System.out.println(lisa);
		System.out.println(silvestre);
		
		Ave miLoro = new Ave();
		miLoro.aseate();
		miLoro.vuela();
		
		Pinguino pingu = new Pinguino();
		pingu.aseate();
		pingu.vuela();
	}
}
