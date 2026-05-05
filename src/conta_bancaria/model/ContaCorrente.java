package conta_bancaria.model;

// conta corrente herda a classe conta
public class ContaCorrente extends Conta {

	//Atributo Limite 
	// representa um atributo exclusivo da classe ContaCorrente
	private float limite; //private, o que significa que só pode ser acessado diretamente dentro da própria classe ContaCorrente.
	
	//Parametros da conta sendo passado na conta corrente 
	public ContaCorrente(int numero, int agencia, int tipo, String titulo, float saldo, float limite) {
		super(numero, agencia, tipo, titulo, saldo);
		this.limite = limite; //  será recebido diretamente por esse novo parâmetro.
	}
	

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	@Override
	public boolean sacar(float valor) {
		
		// "this" → refere-se ao objeto atual
	    // getSaldo() e getLimite() → métodos que retornam valores 
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false; 
		}
		
		// getSaldo() → pega um valor
	    // setSaldo(...) → altera o valor
	    // saldo novo = saldo atual - valor
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	@Override
	public void visualizar() {
		super.visualizar(); //super.visualizar() invoca o método visualizar da classe Conta, permitindo reaproveitar a lógica de exibição dos dados comuns a todas as contas.
		System.err.printf("Limite: R$ %.2fn", this.limite); // responsavel por  exibir o atributo limite, específico da classe ContaCorrente.
	}
	
	
	
}
