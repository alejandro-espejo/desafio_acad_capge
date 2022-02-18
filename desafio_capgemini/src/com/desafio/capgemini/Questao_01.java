package com.desafio.capgemini;
import java.util.Scanner;

public class Questao_01 {
	
	/**
	 * Método para o retorno um matriz formando o desenho de uma escada que terá o tamanho com base o valor da variavel 'numero' utilizando o caracter '*'
	 * @param numero integer - valor total que a escada terá
	 * @param escada_invertida String[][] - matriz que irá conter o desenho da escada.
	 * @return String[][]
	 */
	public static String[][] cria_escada(int numero, String[][] escada_invertida) {
		for (int i = 0; i < escada_invertida.length; i++) {
			for (int j = 0; j < escada_invertida.length; j++) {
				if(j >= (numero-1) - i) {
					escada_invertida[i][j] = "*";
				} else {
					escada_invertida[i][j] = " ";
				}
			}
		}
		return escada_invertida;
	}
	
	/**
	 * Exibe o desenho da escada invertida no console com base nos dados guardados na variavel escada_invertida.
	 * @param escada_invertida String[][] - matriz que contem o desenho da escada.
	 */
	public static void exibe_piramide(String[][] escada_invertida) {
		for (int i = 0; i < escada_invertida.length; i++) {
			for (int j = 0; j < escada_invertida.length; j++) {
				System.out.print(escada_invertida[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		// Criação de uma instancia da classe Scanner para efetuar a leitura de dados no console.
		Scanner scanner = new Scanner(System.in);
		
		// Variavel numero inteiro - utilizada para definir o tamanho da escada.
		int numero = 0;
		
		// Caso o usuário digite um dado inválido, será retornado a mensagem: 'Ocorreu um erro ao executar o programa!' e o programa será encerrado.
		try {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			
			// Variavel escada_invertida String[][] - Utilizada para armazenar o desenho da escada.
			String[][] escada_invertida = new String[numero][numero];
				
			cria_escada(numero, escada_invertida);
			exibe_piramide(escada_invertida);
				
			scanner.close();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao executar o programa!");
		}
	}
}