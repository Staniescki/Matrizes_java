package exercio02;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// definir valores da matriz
		System.out.print("VALOR LINHAS: ");
		int m = sc.nextInt();
		System.out.print("VALOR COLUNAS: ");
		int n = sc.nextInt();

		// instanciar a matriz
		int[][] matriz = new int[m][n];

		// inserindo valores na matriz
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = sc.nextInt();
			}
		}

		// Numero X
		System.out.println("Inserir valor de X: ");
		int x = sc.nextInt();

		// Percorrer a matriz
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] == x) {

					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}

			}
		}

		sc.close();

	}

}
