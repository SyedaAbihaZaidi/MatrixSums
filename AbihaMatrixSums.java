import java.util.Scanner;

public class AbihaMatrixSums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input rows and columns
		System.out.print("Rows: ");
		int rows = sc.nextInt();
		System.out.print("Columns: ");
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];

		// Input matrix elements
		System.out.println("Enter matrix values:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// Print matrix
		System.out.println("\nMatrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// Row sums
		System.out.println("\nRow sums:");
		for (int i = 0; i < rows; i++) {
			int sumRow = 0;
			for (int j = 0; j < cols; j++) {
				sumRow += a[i][j];
			}
			System.out.println("Row " + (i + 1) + ": " + sumRow);
		}

		// Column sums
		System.out.println("\nColumn sums:");
		for (int j = 0; j < cols; j++) {
			int sumCol = 0;
			for (int i = 0; i < rows; i++) {
				sumCol += a[i][j];
			}
			System.out.println("Column " + (j + 1) + ": " + sumCol);
		}

		// Diagonal sums
		if (rows == cols) {
			int forwardDiag = 0;
			int reverseDiag = 0;

			for (int i = 0; i < rows; i++) {
				forwardDiag += a[i][i];
				reverseDiag += a[i][rows - 1 - i];
			}

			System.out.println("\nForward diagonal: " + forwardDiag);
			System.out.println("Reverse diagonal: " + reverseDiag);
		} else {
			System.out.println("\nDiagonal sums require a square matrix.");
		}

		sc.close();
	}
}