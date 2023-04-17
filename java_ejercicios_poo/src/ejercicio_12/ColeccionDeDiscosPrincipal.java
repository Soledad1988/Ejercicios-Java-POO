package ejercicio_12;

public class ColeccionDeDiscosPrincipal {

	public static void main(String[] args) {
		
		// N determina el tamaño del array
	    final int N = 100;
		
		//Crea el array de discos
	    Disco[] discos = new Disco[N];

	    // Crea todos los discos que van en cada una de las celdas del array
	    for(int i = 0; i < N; i++) {
	      discos[i] = new Disco();
	    }

	    // Carga varios discos
	    
	    discos[0] = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
	    discos[1] = new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
	    discos[2] = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
	    
	    System.out.println(discos[0].toString());
	}
}
