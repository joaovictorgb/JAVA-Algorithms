import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] valores = new int[10];
		Scanner getScan = new Scanner(System.in);

		for (byte pos = 0; pos < 10; ++pos)
			valores[pos] = getScan.nextInt();

		for (int valor : valores) {
			if (valor % 2 == 1)
				System.out.println(valor);
		}
		getScan.close();
	}
}
