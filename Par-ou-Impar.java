import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int numero = ent.nextInt();
		if (numero % 2 == 0) {
			System.out.println("Esse numero é par.");
		} else {
			System.out.println("Esse numero é impar");
		}
	}
}
