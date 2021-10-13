import java.util.Scanner;

public class Main {
	static Scanner getScan = new Scanner(System.in);

	public static void main(String[] args) {
		int pillar = 3;
		int lineA = 4;
		int lineB = 2;
		int lineC = 6;

		int[][] matrixA = gettingValues(pillar, lineA, "A");
		int[][] matrixB = gettingValues(pillar, lineB, "B");
		int[][] matrixC = calculatingMatrix(matrixA, matrixB, pillar, lineC);

		System.out.println(returnMatrix(matrixC, pillar, lineC));

		getScan.close();
	}

	static int[][] gettingValues(int pillar, int line, String matrixName) {
		int[][] matrix = new int[pillar][line];

		for (int setPillar = 0; setPillar < pillar; ++setPillar)
			for (int setline = 0; setline < line; ++setline) {
				System.out.printf("Digite o valor na posição [%d][%d] da matriz %s: ", setPillar + 1, setline + 1,
						matrixName);
				matrix[setPillar][setline] = getScan.nextInt();
			}
		return matrix;
	}

	static int[][] calculatingMatrix(int[][] matrixA, int[][] matrixB, int pillar, int line) {
		int[][] matrix = new int[pillar][line];
		for (int setPillar = 0; setPillar < pillar; ++setPillar)
			for (int setline = 0; setline < line; ++setline) {
				matrix[setPillar][setline] = setline < 4 ? matrixA[setPillar][setline]
						: matrixB[setPillar][setline - 4];
			}
		return matrix;
	}

	static String returnMatrix(int[][] matrix, int pillar, int line) {
		String str = "";
		for (int setPillar = 0; setPillar < pillar; ++setPillar) {
			for (int setline = 0; setline < line; ++setline) {
				str += matrix[setPillar][setline] > 9 ? String.format(" %s ", matrix[setPillar][setline])
						: matrix[setPillar][setline] < 0 ? matrix[setPillar][setline] + "\s"
								: String.format(" %s  ", matrix[setPillar][setline]);
			}
			str += "\n";
		}
		return str;
	}
}
