import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int valor;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor de entrada da função: ");
		valor = ler.nextInt();
		System.out.printf("Valor da função com o valor %d é de %d", valor, fibonnaci(valor));
		ler.close();

	}

	public static int fibonnaci(int values) {
		return values == 0 ? 0 : values == 1 ? 1 : fibonnaci(values - 1) + fibonnaci(values - 2);
	}
}
