import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius : ");
		double celsius = ler.nextDouble();
		double soma = cemf(celsius);
		System.out.printf("%.0f celsius é %.1f Fahrenheit", celsius, soma);
	}

	public static double cemf(double celsius) {
		double soma = (1.8 * celsius) + 32;
		return soma;
	}
}
