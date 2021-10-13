import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number = 0;
		Scanner getScan = new Scanner(System.in);

		number = getScan.nextInt();
		if (number > 0 && number < 5)
			System.out.println("Número escolhido : " + number);
		else
			System.out.println("Número inválido");

		getScan.close();
	}
}
