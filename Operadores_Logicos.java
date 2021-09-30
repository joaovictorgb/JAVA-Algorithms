import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Escreva o comprimento do primeiro pedaço da madeira: ");
		double pedaco1 = ent.nextDouble();
		System.out.println("Escreva o comprimento do segundo pedaço da madeira: ");
		double pedaco2 = ent.nextDouble();
		System.out.println("Escreva o comprimento do terceiro pedaço da madeira: ");
		double pedaco3 = ent.nextDouble();
		if (pedaco1 < pedaco2 + pedaco3 && pedaco2 < pedaco1 + pedaco3 && pedaco3 < pedaco1 + pedaco2) {
			System.out.println("Os pedaços de madeira formam um triângulo.");
		} else {
			System.out.println("Os pedaços de madeira não formam um triângulo.");
		}
	}
}
