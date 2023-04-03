package ejercicio_10;

public class PruebaMascota {

	public static void main(String[] args) {
		
		//una interface NO puede instanciar!!!
		Mascota garfield = new Gato(Sexo.MACHO, "34569");
		Mascota lisa = new Gato(Sexo.HEMBRA, "96059");
		
		System.out.println(garfield.getCodigo());
		System.out.println(lisa.getCodigo());
		
		garfield.come("pescado");
		lisa.come("hamburguesa");
	}
}
