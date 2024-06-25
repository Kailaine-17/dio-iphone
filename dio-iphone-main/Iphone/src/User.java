import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Iphone iphone = new Iphone();
		int repeticaoMensagemInicial = 0;
		
		boolean funcionamentoIphone = true;
		while(funcionamentoIphone) {
			if(repeticaoMensagemInicial == 0) {
				System.out.println("Bem vindo ao sistema do seu Iphone.\nEsse aparelho possui 3 funcionalidades: Reprodutor Musical, Navegador na Internet e Aparelho Telefônico.\nDisque...\n1 para Reprodutor Musical\n2 para Navegador na Internet\n3 para Aparelho Telefônico\n0 para sair do sistema.");
			} else {
				System.out.println("\nDisque...\n1 para Reprodutor Musical\n2 para Navegador na Internet\n3 para Aparelho Telefônico\n0 para sair do sistema.");
			}			
			int funcionalidade = scanner.nextInt();
			if(funcionalidade == 1) {
				iphone.selecionarMusica();
				iphone.tocar();
				iphone.pausar();
				repeticaoMensagemInicial++;
			} else if(funcionalidade == 2) {
				iphone.exibirPagina();
				iphone.adicionarNovaAba();
				iphone.atualizarPagina();
				repeticaoMensagemInicial++;
			} else if(funcionalidade == 3) {
				iphone.ligar();
				iphone.atender();
				iphone.iniciarCorreioVoz();
				repeticaoMensagemInicial++;
			} else if(funcionalidade == 0) {
				if(repeticaoMensagemInicial==0) {
					System.out.println("Explore cada vez mais as funcionalidades do seu Iphone, você se surpreenderá! \nEncerrando o sistema...");
				} else if(repeticaoMensagemInicial==1){
					System.out.println("Esperamos que tenha sido uma experiência especial no único acesso que fez às nossas funcinalidades. \nEncerrando o sistema...");
				} else {
					System.out.println("Esperamos que tenha sido uma experiência única nos "+repeticaoMensagemInicial+" acessos que fez às nossas funcinalidades. \nEncerrando o sistema...");
				}
				funcionamentoIphone = false;
			} else {
				System.out.println("Opção inválida! Tente novamente");	
			}
		}
		scanner.close();
	}
}
