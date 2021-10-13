import java.util.Scanner;

public class Main {
	static enum calculus {
		SUM, SUBTRACTION
	}

	static Scanner getScan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Digite o valor de m das matrizes: ");
		int pillar = getScan.nextInt();
		System.out.print("Digite o valor de n das matrizes: ");
		int line = getScan.nextInt();

		if (pillar > 0 && line > 0) {
			int[][] matrix1 = gettingValues(pillar, line);
			int[][] matrix2 = gettingValues(pillar, line);

			String printSum = returnMatrix(calculatingMatrix(matrix1, matrix2, pillar, line, calculus.SUM), pillar,
					line);
			String printSubtraction = returnMatrix(
					calculatingMatrix(matrix1, matrix2, pillar, line, calculus.SUBTRACTION), pillar, line);

			System.out.println("Soma das matrizes:\n" + printSum);
			System.out.println("Subtração das matrizes:\n" + printSubtraction);
		}

		getScan.close();
	}

	static int[][] gettingValues(int pillar, int line) {
		int[][] matrix = new int[pillar][line];

		for (int setPillar = 0; setPillar < pillar; ++setPillar)
			for (int setline = 0; setline < line; ++setline) {
				System.out.printf("Digite o valor na posição [%d][%d]: ", setPillar + 1, setline + 1);
				matrix[setPillar][setline] = getScan.nextInt();
			}
		return matrix;
	}

	static int[][] calculatingMatrix(int[][] matrixA, int[][] matrixB, int pillar, int line, calculus action) {
		int[][] matrix = new int[pillar][line];
		for (int setPillar = 0; setPillar < pillar; ++setPillar)
			for (int setline = 0; setline < line; ++setline) {
				if (action == calculus.SUM)
					matrix[setPillar][setline] = matrixA[setPillar][setline] + matrixB[setPillar][setline];
				else
					matrix[setPillar][setline] = matrixA[setPillar][setline] - matrixB[setPillar][setline];
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
