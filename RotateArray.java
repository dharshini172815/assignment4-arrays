package assignment4_arrays;

import java.util.Scanner;
public class RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+ " elements: ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the rotation count: ");
		int count = sc.nextInt();
		System.out.println("Original array: ");
		for(int n:arr) {
			System.out.print(n+ "  ");
		}
		count = count%size;
		for(int i=0; i<count; i++) {
			int last = arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		System.out.println();
		System.out.println("After rotation: ");
		for(int num:arr) {
			System.out.print(num+ "  ");
		}
	}

}
