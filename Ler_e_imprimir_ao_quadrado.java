import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int valor = 0;
		Scanner getScan = new Scanner(System.in);

		if ((valor = getScan.nextInt()) != 0) {
			System.out.println("Valor: " + valor + "\nValor quadrado: " + Math.pow(valor, 2));
		}

		getScan.close();
	}
}
