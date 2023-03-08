package ejercicio_4;

public class Cuenta {

	private double saldo; 
	private int agencia = 1;
	private int numero;
	
	private Cliente titular = new Cliente();
	
	private static int total;
	
	public Cuenta(int agencia, int numero) {//constructor - aqui se crea una nueva cuenta
			this.agencia = agencia;
			this.numero = numero;
			//System.out.println("Estoy creando una cuenta " + this.numero);
		total++;
		//System.out.println("se han creado: " + total + " Cuentas");
	}
	
	//definir el primer metodo, toda secuencia de pasos para realizar una accion
	
    //no retorna valor
	public void depositar(double valor){
		// Esta cuenta    Esta cuenta
		// this account   this account
		// this object
		// this.saldo  = this.saldo + valor;
		   this.saldo += valor;
	}
	
	
	//retorna valor
	public boolean retirar(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		} 
			return false;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo>=valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		}
			return  false;
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Cuenta.total = total;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
