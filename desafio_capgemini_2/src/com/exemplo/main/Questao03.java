package com.exemplo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = "";
		int sqrt = 0;
		
		// Write a sentence
		System.out.println("Write a sentence: ");
		s = scanner.nextLine();

		// Remove the blanks
		s = s.replaceAll("\\s+", "");
		
		// Calculate the square root.
		sqrt = (int) Math.ceil(Math.sqrt(s.length()));
		
		// List creation
		List<String> text_parts = new ArrayList<String>();
		
		// Performs the division of String and insert into List
		for (int i = 0; i < s.length(); i += sqrt) {
			text_parts.add(s.substring(i, Math.min(i + sqrt, s.length())));
		}
		
		// Display the encrypted code in the console
		for(int i = 0; i < text_parts.size(); i++) {
			for (String string : text_parts) {
				try {
					System.out.print(string.charAt(i));
				} catch (StringIndexOutOfBoundsException e) {
					continue;
				}
			}
			System.out.print(" ");
		}
		scanner.close();
	}
}
