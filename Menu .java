import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("------Menu-------");
		System.out.println("A - Multiplicar");
		System.out.println("B - Somar");
		System.out.println("Digite uma dessas opções: ");
		char op = ent.next().charAt(0);
		System.out.println("Digite um valor inicial: ");
		double v1 = ent.nextDouble();
		System.out.println("Digite um outro valor: ");
		double v2 = ent.nextDouble();
		if (op == 'A' || op == 'a') {
			System.out.println("O Resultado da multiplicação e: " + v1 * v2);
		} else if (op == 'B' || op == 'b') {
			System.out.println("O Resultado da adição e : " + (v1 + v2));
		} else {
			System.out.println("Erro ,tente novamente!!!");
		}
	}
}
