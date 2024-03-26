//¿Cuál es el resultado de la siguiente clase? (Elija todas las que correspondan)
//A. Compiler error on line 1.
//B. Compiler error on line 2.
//C. Compiler error on line 4.
//D. Compiler error on line 5.
//E. Compiler error on line 6. correcta
//F. 0null
//G. nullnull

package test;

public class _C {

	private static  int $;

	public static void main(String[] args) {
		String a_b;

		System.out.print($);

		//System.out.println(a_b);
	}
	
}


/*La opción E es correcta porque las variables locales requieren asignación antes de hacer referencia
a ellos. La opción D es incorrecta porque las variables de clase e instancia tienen valores predeterminados
y permitir la referencia. a_b por defecto es un valor nulo. Las opciones A, B y C son incorrectas
porque los identificadores pueden comenzar con una letra, un guión bajo o un signo de dólar. Opciones F y
G son incorrectos porque el código no se compila. Si a_b fuera una variable de instancia, la
el código compilaría y generaría 0null. Para obtener más información, consulte el Capítulo 1.*/