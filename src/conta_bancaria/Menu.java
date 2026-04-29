package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(1, 123, 1, "Adriana Sanches", 10000.0f);
		
		// Visualiar os dados
		 c1.visualizar();
		 
		 // Permite alterar o Saldo e o nome do Titulo
		 c1.setSaldo(15000.0f);
		 c1.setTitulo("Maria Joaquina");
		 c1.visualizar();
		 
		 //Sacar
		 c1.sacar(12000.0f);
		 c1.visualizar();
		 
		 //Depositar
		 c1.depositar(5000.0f);
		 c1.visualizar();

		//responsável receber entradas 
		Scanner leia = new Scanner(System.in);
		
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
		opcao = leia.nextInt();
		
		//Verificar se o valor da variável opcao é igual a 0.
		if (opcao == 0) {
			System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
			sobre(); // chama o método "sobre()" que utiliza void
             leia.close(); 
			System.exit(0);	//Encerra a execução do programa imediatamente
			
			
			//Switc responsavel por dar uma opção de escolha para cada caso
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n");
				break;
			}
			
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

}
