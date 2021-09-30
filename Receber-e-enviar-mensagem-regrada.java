import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite uma nota: ");
		int nota = ent.nextInt();
		switch (nota) {
		case 0, 1, 2, 3: {
			System.out.println("Você precisa melhorar muito!");
		}
			break;
		case 4, 5, 6: {
			System.out.println("Você está quase conseguindo!");
		}
			break;
		case 7, 8: {
			System.out.println("Você conseguiu!");
			break;
		}
		case 9, 10: {
			System.out.println("Você conseguiu com distinção!");
			break;
		}
		default: {
			System.out.println("Nota inválida!");
		}
		}
	}
}
