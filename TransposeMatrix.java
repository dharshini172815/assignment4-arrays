package assignment4_arrays;
import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for row & column size: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		if(row!=col) {
			System.out.println("ERROR:  " +row+ " not equal to " +col+ "!!!");
		}
		else {
		int mat[][]=new int[row][col];
		System.out.println("Enter " +row*col+" elements: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int transpose[][] = new int[col][row];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col;j++) {
				transpose[i][j] = mat[j][i];
			}
		}
		
		System.out.println("Original matrix: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(mat[i][j]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println("Transpose matrix: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(transpose[i][j]+ "\t");
			}
			System.out.println();
		}
		}
	}

}
