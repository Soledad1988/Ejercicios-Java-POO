package ejercicio_3;

public class Libro {

	private String nombreLibro;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	//constructor vacio
	public Libro() {
		
	}

	//constructor con parametros
	
	public Libro(String nombreLibro, String autor, int ejemplares, int prestados) {
		this.nombreLibro = nombreLibro;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	
	//getters y setters
	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	//metodo prestamos
	public boolean prestamo() {
		boolean prestado = true;
		if(prestados < ejemplares) {
			prestados++;
		} else{
			return false;
		} return prestado;
	}
	
	//metodo para realizar devoluciones
	public boolean devolucion() {
		boolean devuelto = true;
		if(prestados == 0) {
			devuelto = false;
		}else {
			prestados--;
		}
		return devuelto;
	}

	//método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "titulo: " + nombreLibro + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;                                    
    }
	
	
	
	
}
