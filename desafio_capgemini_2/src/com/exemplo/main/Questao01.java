package com.exemplo.main;

import java.util.Arrays;
import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		
		// Insert values into array
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter a value: ");
			arr[i] = scanner.nextInt();
		}
		
		// Sort the array
		Arrays.sort(arr);
		
		// Check the median
		int size = arr.length - 1;
		int median = arr[size] / 2;
		
		// Display the median
		System.out.println("Mediana: " + median);
		
		scanner.close();
	}
}
