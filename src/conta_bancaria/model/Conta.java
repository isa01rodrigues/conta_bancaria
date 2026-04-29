package conta_bancaria.model;

// não possui o main pois não se trata da classe principal do projeto.

//
public class Conta {

	// Criaçãod de atributos

	// private significa que só podem ser acessados diretamente dentro da própria
	// classe.

	private int numero;
	private int agencia;
	private int tipo;
	private String titulo;
	private float saldo;

	public Conta(int numero, int agencia, int tipo, String titulo, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titulo = titulo;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// Criar os Métodos Auxiliares

	public boolean sacar(float valor) {
		if (this.saldo < valor) {
			System.out.println("\n Saldo Insuficiente");
			return false;
		}
		this.saldo = this.saldo - valor; // this é usada para indicar que estamos manipulando o atributo saldo da
											// instância atual da classe
		return true;
	}

	// Metodo Depositar

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	// Método Visualizar
	public void visualizar() {
		String tipo = "";
		
		switch (this.tipo) {
		case 1: 
			tipo = "Conta Corrente";
			
		case 2: 
			tipo = "Conta Poupança";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titulo);
		System.out.printf("Saldo: R$ %.2f%n", this.saldo);
	}
	
	
	
	

}
