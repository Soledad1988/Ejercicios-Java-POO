package ejercicio_2;

public class EjecutableContador {

	public static void main(String[] args) {
		Contador contador1 = new Contador();
		
		
		//asignar un valor al contador
		contador1.setCont(5);
		//mostrar valor actual
		System.out.println(contador1.getCont());
		//incrementar contador
		contador1.incrementar();
		System.out.println(contador1.getCont());
		//decrementar
		contador1.decrementar();
		System.out.println(contador1.getCont());
	}
}
