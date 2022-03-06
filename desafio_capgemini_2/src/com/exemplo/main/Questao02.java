package com.exemplo.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int count = 0;
		int num_random = 0;
		boolean contains = false;
		Integer[] array = new Integer[10];
		
		// Insert the value of 'X'
		System.out.println("Enter a X value: ");
		Integer x = scanner.nextInt();
		
		// Add values to the array
		while (count < array.length) {
			num_random = random.nextInt(20);
			contains = Arrays.asList(array).contains(num_random);
			
			if(!contains) {
				array[count] = num_random;
				count++;
			}
		}
		
		// Descending order
		Arrays.sort(array, Collections.reverseOrder());
		
		// Print the vector
		for (Integer integer : array) {
			System.out.print(integer + " ");
		}
		
		System.out.println("");
		
		// Checks two values and adds if the subtraction of two values equals 'X'.
		for(int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] - array[j] == x) {
					System.out.print("[" + array[i] + ", " + array[j] + "] " );
				}
			}
		}
		scanner.close();
	}
}