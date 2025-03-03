package assignment4_arrays;

import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row in matrix 1: ");
		int p = sc.nextInt();
		System.out.println("Enter number of column in matrix 1: ");
		int q = sc.nextInt();
		System.out.println("Enter number of row in matrix 2: ");
		int m = sc.nextInt();
		System.out.println("Enter number of column in matrix 2: ");
		int n= sc.nextInt();
		//in matrix multiplication first matrix column is equal to second matrix row 
		if(q!=m) {
			System.out.println("Multiplication is not possible!!!");
			return;
		}
		
		int[][] a = new int[p][q];
		int[][] b = new int[m][n];
		int[][] c = new int[p][n];//result matrix size = matrix 1 row, matrix 2 column
		
		System.out.println("Enter the elements in matrix 1: ");
		for(int i=0; i<p; i++) {
			for(int j=0; j<q; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements in matrix 2: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("First Matrix: ");
		for(int i=0; i<p; i++) {
			for(int j=0; j<q; j++) {
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("Second Matrix: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(b[i][j]+ "\t");
			}
			System.out.println();
		}
		//for multiplication
		for(int i=0; i<p; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<q; k++) {
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("Result Matrix: ");
		for(int i=0; i<p; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(c[i][j]+ "\t");
			}
			System.out.println();
		}

	}

}
