package assignment4_arrays;
import java.util.Scanner;
public class SpiralMatrix {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the matrix (N): ");
	        int N = sc.nextInt();

	        int[][] matrix = new int[N][N];

	        // Spiral order variables
	        int top = 0, bottom = N - 1, left = 0, right = N - 1;
	        int num = 1; // Number to be filled

	        while (num <= N * N) {
	            // Fill from left to right
	            for (int i = left; i <= right; i++) {
	                matrix[top][i] = num++;
	            }
	            top++; // Move the top boundary down

	            // Fill from top to bottom
	            for (int i = top; i <= bottom; i++) {
	                matrix[i][right] = num++;
	            }
	            right--; // Move the right boundary left

	            // Fill from right to left (if there are remaining rows)
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    matrix[bottom][i] = num++;
	                }
	                bottom--; // Move the bottom boundary up
	            }

	            // Fill from bottom to top (if there are remaining columns)
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    matrix[i][left] = num++;
	                }
	                left++; // Move the left boundary right
	            }
	        }

	        System.out.println("Generated Spiral Matrix:");
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                System.out.print(matrix[i][j]+ "\t"); 
	            }
	            System.out.println();
	        }


	}

}
