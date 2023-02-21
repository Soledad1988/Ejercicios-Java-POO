package ejercicio_3;

public class EjecutableLibro {

	public static void main(String[] args) {
		Libro libro1 = new Libro();
		
		libro1.setNombreLibro("Bill Summers");
		libro1.setAutor("Stephen King");
		libro1.setEjemplares(2);
		
		System.out.println(libro1);
		
		//prestamo
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getNombreLibro());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getNombreLibro() + " para prestar");         
        }
		
		
		Libro libro2 = new Libro("El quijote","Cervantes",5,0);
		System.out.println(libro2.getEjemplares());
	}
}
