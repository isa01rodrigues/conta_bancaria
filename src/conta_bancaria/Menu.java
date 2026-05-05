package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 
		// Teste da Classe Conta Corrente
			ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "José da Silva", 0.0f, 1000.0f);
			cc1.visualizar();
			cc1.sacar(12000.0f);
			cc1.visualizar();
			cc1.depositar(5000.0f);
			cc1.visualizar();
					
			// Teste da Classe Conta Poupança
			ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Maria dos Santos", 100000.0f, 15);
			cp1.visualizar();
			cp1.sacar(1000.0f);
			cp1.visualizar();
			cp1.depositar(5000.0f);
			cp1.visualizar();
		 
		 

		//responsável receber entradas 
		//Scanner leia = new Scanner(System.in);
		
		//responsável  armazenará o número  
		int opcao;
		
		//responsável por exibir o menu
		// (true) indica que o laço de repetição será infinito, continuará em execução até que ocorra uma instrução de interrupção manual
		
	while (true) {
		// 	System.out.println esponsavel por imprimir as informações do menu
		//responsável por definir constantes que permitem aplicar cores aos textos e planos de fundo nos comandos de saída no console.
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
				+ "*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                BANCO DO BRAZIL COM Z                ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Criar Conta                          ");
		System.out.println("            2 - Listar todas as Contas               ");
		System.out.println("            3 - Buscar Conta por Numero              ");
		System.out.println("            4 - Atualizar Dados da Conta             ");
		System.out.println("            5 - Apagar Conta                         ");
		System.out.println("            6 - Sacar                                ");
		System.out.println("            7 - Depositar                            ");
		System.out.println("            8 - Transferir valores entre Contas      ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     " + Cores.TEXT_RESET);
		
		// Utilizamos o método nextInt() do objeto "leia", para ler a entrada do usuário como um número inteiro
		// O valor digitado pelo usuário será armazenado na variável "opcao"		
		//try tenta executar um código que pode gerar erro
		try {
			opcao = leia.nextInt();
			leia.nextLine();
			
		} //trata o erro caso o usuário digite algo que não seja número inteiro
		catch (InputMismatchException e) {
			opcao = -1;
			System.out.println("\nDigite um número inteiro!");
			leia.nextLine();
		}

		if (opcao == 0) {
			System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
			sobre();
			leia.close();
			System.exit(0);
		}

		switch (opcao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

			keyPress();
			break;
		case 2:
			System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

			keyPress();
			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

			keyPress();
			break;
		case 4:
			System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

			keyPress();
			break;
		case 5:
			System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

			keyPress();
			break;
		case 6:
			System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

			keyPress();
			break;
		case 7:
			System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

			keyPress();
			break;
		case 8:
			System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

			keyPress();
			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
			keyPress();
			break;
		}
	}
}
	

	//"void" indica que o método NÃO retorna nenhum valor.
	// responsável por executar uma ação,
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
		
	}
	
	
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		leia.nextLine();
	}

}
