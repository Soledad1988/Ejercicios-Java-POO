package java_primeros_pasos;

public class EjemploCaracteres {

	//escribir main ctrl espacio y aparece automaticamente
	public static void main(String[] args) {
		
		char caracter ='a';
		System.out.println(caracter);
		
		char segundoCaracter = (char) (caracter + 1);
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		palabra = palabra + " 2023";
		System.out.println(palabra);
	}
}
