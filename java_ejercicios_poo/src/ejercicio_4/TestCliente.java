package ejercicio_4;

public class TestCliente {

public static void main(String[] args) {
		
		Cliente cliente01 = new Cliente();
		
		cliente01.setNombre("Soledad");
		cliente01.setDocumento("45789325");
		
		System.out.println("se ha generado el alta de un nuevo cliente: ");
		System.out.println("Nombre: " + cliente01.getNombre());
		System.out.println("DNI: " + cliente01.getDocumento());
		
		
	}
}
