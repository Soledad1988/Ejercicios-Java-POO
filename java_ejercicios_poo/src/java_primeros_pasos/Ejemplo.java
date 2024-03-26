package java_primeros_pasos;

public class Ejemplo {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		//tipo de datos entero - int
		int edad = 28;
		System.out.println(edad);
		
		edad = 47;
		System.out.println(edad);
		
		edad = 46 + 88;
		System.out.println("Mi edad es "+ edad);
		
		//tipo de dato double - valores decimales
		double salario = 1250.50;
		System.out.println(salario);
		
		double salarioMitad = salario/2;
		System.out.println(salario);
		
		//Convertir tipos de datos
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; //Cast
		System.out.println(variable1Entero);
		
	}
}
