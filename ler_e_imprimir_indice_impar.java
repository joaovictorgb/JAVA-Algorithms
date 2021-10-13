import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1;
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite um numero:");
			numero1 = ler.nextInt();
			if ((numero1 % 2) != 0) {

				System.out.println("O numero " + numero1 + " é impar.");
			}
		}
	}
}
