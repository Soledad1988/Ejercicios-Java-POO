package ejercicio_5;

//programa que prueba la calse libro - se instancia
public class PruebaLibro {

	public static void main(String[] args) {
	
		Libro vicNix = new Libro();
		
		vicNix.setIsbn("001");
		vicNix.setAutor("Invictor");
		vicNix.setTitulo("En la ciudad secreta");
		vicNix.setNumeroDePaginas(210);
		
		System.out.println(vicNix.getIsbn() + " "+ vicNix.getAutor() +" "+ vicNix.getTitulo());
		
		Libro  billy = new Libro();
		
		billy.setIsbn("002");
		billy.setAutor("Stephen King");
		billy.setTitulo("Billy Summers");
		billy.setNumeroDePaginas(642);
		
		System.out.println(billy.getIsbn() + " "+ billy.getAutor() +" "+ billy.getTitulo());
		
	}
	

}
