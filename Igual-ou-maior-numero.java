import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num1 = ent.nextInt();
		System.out.print("Digite outro numero: ");
		int num2 = ent.nextInt();
		if (num1 == num2) {
			System.out.println("Os numeros são iguais.");
		} else {
			if (num1 > num2) {
				System.out.println("O numero " + num1 + " é maior");
			} else {
				System.out.println("O numero " + num2 + " é maior");
			}
		}
	}
}
