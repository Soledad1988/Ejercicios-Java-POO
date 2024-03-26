package java_primeros_pasos;

public class EjemploCondicionales2 {

	public static void main(String[] args) {
		System.out.println("hello world");

		int edad = 17;
		int cantidadPersonas = 2;

		if (edad >= 18 || cantidadPersonas >= 2) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no puede entrar");
		}
	}

}
