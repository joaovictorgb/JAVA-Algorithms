import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor da cotação em Dolar : ");
		double cot = ler.nextDouble();
		System.out.println("Digite o valor em reais para conversão : ");
		double real = ler.nextDouble();
		double resultado = dolar(cot, real);
		System.out.printf("O valor de %.2f para dolar fica %.2f dolares", real, resultado);
	}

	public static double dolar(double cot, double real) {
		double resultado = real / cot;
		return resultado;
	}

}
