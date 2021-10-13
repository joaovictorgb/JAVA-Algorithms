public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 8; ++i)
			System.out.print(i * 2 + (i == 7 ? ". " : ", "));
	}
}
