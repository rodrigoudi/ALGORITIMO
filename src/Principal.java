import java.util.Scanner;

public class Principal {

	static Aluno alunos[] = new Aluno[20];

	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Informe quantos alunos serao inseridos");
		Integer quantosAlunos = scanner.nextInt();
		scanner.nextLine();
		for (int j = 0; j < quantosAlunos; j++) {
			alunos[j] = LerAluno();
		}
		imprimirAlunos();
	}

	private static void imprimirAlunos() {
		for(int  i = 0 ; i < alunos.length ; i ++){
			System.out.println("Imprimindo aluno da posicao "+i);
			System.out.println("Nome: "+alunos[i].nome]);
			System.out.println("RA: "+alunos[i].ra]);
			System.out.println("Email: "+alunos[i].email]);
			for (int j = 0; j < alunos[i].telefones.length ;  i ++ ){
				if(alunos[i].telefones[j] != null){
					System.out.println("Telefone:");
					System.out.println("Tipo: "+alunos[i].telefones[j].tipo);
					System.out.println("Numero: "+alunos[i].telefones[j].numero);

				}
			}
		}
	}

	private static Aluno LerAluno() {
		Aluno aluno = new Aluno();
		System.out.println("Inserindo novo Aluno");
		System.out.println("Digite o R.A.");
		aluno.ra = scanner.nextLine();
		System.out.println("Digite o Nome");
		aluno.nome = scanner.nextLine();
		System.out.println("Informe quantos telefones serao inseridos");
		Integer quantosTelefones = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < quantosTelefones; i++) {
			aluno.telefones[i] = LerTelefone(i);
		}
		return aluno;
	}

	private static Telefone LerTelefone(int i) {
		Telefone telefone = new Telefone();
		System.out.println("Digite o tipo do telefone da posicao" + i);
		telefone.tipo = scanner.nextLine();
		System.out.println("Digite o numero do telefone da posicao" + i);
		telefone.numero = scanner.nextLine();
		return telefone;
	}
}
