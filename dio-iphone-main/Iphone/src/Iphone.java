import java.util.Scanner;

public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico{
	Scanner scanner = new Scanner(System.in);
	static String musica;
	static int contadorAbas = 1;
	static boolean continuarTocando = false;
	
	//Reprodutor Musical
	public void selecionarMusica() {
		System.out.printf("Selecione uma música: ");
		musica = scanner.nextLine();
	}
	public void tocar() {
		continuarTocando = true;
		System.out.println("Música "+musica+" tocando.");
	}
	public void pausar() {
		continuarTocando = false;
		System.out.println("Música "+musica+" pausada.");
	}
	
	//Navegador na Internet
	public void exibirPagina() {
		System.out.println("Indique a url da página que deseja navegar:");
		String url = scanner.next();
		System.out.println("Você está sendo redirecionado para a página de url "+url);
	}
	public void adicionarNovaAba() {
		contadorAbas++;
		System.out.println("Uma nova aba foi adicionada no seu navegador, que agora possui "+contadorAbas+" abas abertas");
	}
	public void atualizarPagina() {
		System.out.println("Refresh realizado com sucesso! Página atualizada.");
	}
	
	//Aparelho Telefônico
	public void ligar() {
		System.out.println("Disque o número do celular que deseja ligar:");
		String numeroTelefonico = scanner.next();
		System.out.println("Chamando o número "+numeroTelefonico);
	}
	public void atender() {
		System.out.println("Chamada atendida.");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado.");
	}
}
