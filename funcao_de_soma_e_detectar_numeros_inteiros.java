import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int termo1, termo2;
		do {
			System.out.print("Digite o termo 1: ");
			termo1 = ler.nextInt();
		} while (termo1 <= 0);
		do {
			System.out.print("Digite o termo 2 (lembrando tem de ser maior que o termo 1): ");
			termo2 = ler.nextInt();
		} while (termo2 <= termo1);
		System.out.printf("A soma dos termos %d e %d é: %d .", termo1, termo2, retornarValores(termo1, termo2));
		ler.close();
	}

	public static int retornarValores(int valorMin, int valorMax) {
		int soma = 0;
		for (int num = valorMin + 1; num < valorMax; ++num) {
			soma += num;
		}
		return soma;
	}
}
