import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int nota1, nota2, nota3, nota4;
		String nome, disciplina;
		int media;
		System.out.println("Digite seu nome: ");
		nome = ent.nextLine();
		System.out.println("Digite a disciplina: ");
		disciplina = ent.nextLine();
// recebe a 1o nota
		System.out.println(nome + ", digite sua 1a nota");
		nota1 = ent.nextInt();
// recebe a 2o nota
		System.out.println(nome + ", digite sua 2a nota");
		nota2 = ent.nextInt();
		System.out.println(nome + ", digite sua 3a nota");
		nota3 = ent.nextInt();
		System.out.println(nome + ", digite sua 4a nota");
		nota4 = ent.nextInt();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média do aluno " + nome + " em " + disciplina + " é : " + media);

	}
}
