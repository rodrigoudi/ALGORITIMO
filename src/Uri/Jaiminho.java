package Uri;
import java.util.Scanner;

public class Jaiminho {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer QT = scanner.nextInt();
		//loop sobre a quantidade de entradas
		for (int i = 0;i<QT;i++) {
			Integer N = scanner.nextInt();
			PontoDiario[] pontos = new PontoDiario[N];
			// loop sobre a quantidade de pontos diários sobre cada entrada
			for (int j = 0;j<N;j++) {
				scanner.nextLine();
				String ponto = scanner.nextLine();
				String[] entradas = ponto.split(" ");
				
				PontoDiario pontoDiario = new PontoDiario();
				pontoDiario.entradaPrimeiro = entradas[0];
				pontoDiario.saidaPrimeiro = entradas[1];
				pontoDiario.entradaSegundo = entradas[3];
				pontoDiario.saidaSegundo = entradas[4];
				pontos[j] = pontoDiario;												
			}
			//calculando o saldo de horas sobre cada entrada
			Integer saldoHoras = 0;
			for (int j = 0; j < pontos.length;j++) {
				saldoHoras += pontos[j].calculaSaldoHoras();
			}
			respostas [i] = (PontoDiario.converteMinutoHora(saldoHoras));
		}
		for (String resposta: respostas){
			System.out.println(resposta);
		}
		for (int i = 0 ; i< respostas.lenght; i++){
			String resposta =  respostas[i];
			System.out.println(resposta);
		}
	}
}