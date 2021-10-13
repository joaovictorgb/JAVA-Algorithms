public class Main {
	public static void main(String[] args) {
		byte tamanho = 10;
		System.out.print("Espaço de armazenamento do vetor em...\n" + "Char: " + Character.BYTES * tamanho + " Bytes\n"
				+ "Short: " + Short.BYTES * tamanho + " Bytes\n" + "Long: " + Long.BYTES * tamanho + " Bytes\n"
				+ "Float: " + Float.BYTES * tamanho + " Bytes\n" + "Double: " + Double.BYTES * tamanho + "Bytes\n");
	}
}
