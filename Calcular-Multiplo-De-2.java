import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int somatorio = 0;
		for (int i = 1; i < 6; i++) {
			System.out.printf("Entre com o número %d: ", i);
			somatorio += ent.nextInt();
		}
		if (somatorio % 2 == 0) {
			System.out.println("Os numeros são múltiplo de 2.");
		} else {
			System.out.println("Os numeros não são múltiplo de 2.");
		}
	}
}
