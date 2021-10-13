import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um caractere:");
		String letra = ler.next();
		char letra1 = letra.charAt(0);
		if (letra1 >= '0' && letra1 <= '9') {

			System.out.println("Não valido numeros.");
		} else {
			int result = vogal(letra);
			if (result == 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		}
	}

	public static int vogal(String letra) {
		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
				|| letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
			return 0;
		} else {
			return 1;
		}
	}
}
