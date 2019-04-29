package exercioResolvido;

import java.util.Scanner;

public class MainExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		
		//Inserindo valores na matriz.
		for(int i=0; i<matriz.length; i++) {
			
			for(int j=0; j<matriz[i].length; j++) {
				System.out.printf("Inserir [%d][%d]", i,j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		
		
		//Imprimindo a matriz diagonal
		for(int i=0; i<matriz.length; i++) {
		System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
	
		//Imprimindo Valores Negativos.
		int contador =0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					contador++;
				}
			}
			
		}
		
		System.out.println("Numeros negativos: " + contador);
		
		
		sc.close();
		
		

	}

}
