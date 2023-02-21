package ejercicio_1;

public class Cuenta {
	//Atributos
   private String titular;
   private double cantidad;
   
   
   //Constructores
   public Cuenta(String titular) {
	   this.titular = titular;
   }
   
   public Cuenta(String titular, double cantidad) {
	   this.titular = titular;
	   if(cantidad < 0) {
		   this.cantidad = 0;
	   }else {
		   this.cantidad = cantidad;
	   }
	   this.cantidad = cantidad;
   }

   //Metodos
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/*
	 * Ingresa dinero a la cuenta,
	 * solo si es positivo la cantidad
	 * */
	
	public void ingresar(double cantidad) {
		if(cantidad > 0) {
			this.cantidad += cantidad;
		}
	}
	

	/*
	 *retira una cantidad de la cuenta 
	 * si queda en negativo seria 0
	 * 
	 * */
	public void retirar(double cantidad) {
		if(this.cantidad - cantidad <0) {
			this.cantidad = 0;
		}else {
			this.cantidad -= cantidad;
		}
	}

	
	/*
	 * Devuelve el estado del objeto
	 * */
   
	@Override
	public String toString() {
		return "El titular " + titular + " tiene " + cantidad + " en su cuenta";
	}
   
}
