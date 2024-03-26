//¿Cuál es el resultado del siguiente código?

//A. true se imprime exactamente una vez.
//B. true se imprime exactamente dos veces.
//C. true se imprime exactamente tres veces. resuesta correcta
//D. true se imprime exactamente cuatro veces.
//E. El código no se compila.


package test;

public class Prueba2 {

	public static void main(String[] args) {
		
	String s1 = "Java";
	String s2 = "Java";
	StringBuilder sb1 = new StringBuilder();
	
	
	sb1.append("Ja").append("va");
	System.out.println(s1 == s2); //true
	System.out.println(s1.equals(s2)); //true
	System.out.println(sb1.toString() == s1); //false
	System.out.println(sb1.toString().equals(s1)); //true
}}

/*C. Los literales de cadena se utilizan del grupo de cadenas. Esto significa que s1 y s2 se refieren a la
mismo objeto y son iguales. Por lo tanto, las dos primeras sentencias de impresión se imprimen como verdaderas. El
la tercera declaración de impresión imprime falso porque toString() usa un método para calcular el
valor y no es del grupo de cadenas. La declaración de impresión final vuelve a imprimir verdadero
porque equals() mira los valores de los objetos String. Para más información, ver
Capítulo 3.*/