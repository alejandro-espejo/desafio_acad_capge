package com.desafio.capgemini;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao_03 {

	public static void main(String[] args) {
		// Criação de uma instancia da classe Scanner para efetuar a leitura de dados no console.
		Scanner scanner = new Scanner(System.in);
		
		// Variavel String usada para obter uma parte da palavra digitada pelo usuário.
		String meia_palavra = "";
		
		// Variavel do tipo String para inverter um subconjunto das letras da palavra e usada para verificar se é igual a meia_palavra.
		String palavra_invertida = "";
		
		// Variavel do tipo String para verificar se há letras iguais
		String letras_iguais = "";
		
		// ArrayList do Tipo String usada para armazenar os anagramas
		ArrayList<String> anagrama = new ArrayList<String>();
		
		System.out.println("Digite uma palavra: ");
		String palavra = scanner.next();
		
		// Converte a palavra digitada pelo usuário para um vetor e armazena na variavel 'palavra_vetor'
		String[] palavra_vetor = palavra.split("");
		
		// FOR usado para percorrer todo o vetor
		for (int i = 0; i < palavra_vetor.length; i++) {
			for (int j = 0; j < palavra_vetor.length; j++) {
				
				// IF usado para verificar se há letras iguais
				if(palavra_vetor[i].equals(palavra_vetor[j]) && i != j && j > i)  {
					letras_iguais = palavra_vetor[i] + palavra_vetor[j];
					
					// IF usado para adicionar as letras iguais no Array 'anagrama'
					if(!anagrama.contains(letras_iguais)) {
						//System.out.println("["+ i + ", "+ j + "]");
						anagrama.add(letras_iguais);
					}
				}
				
				// IF usado para verificar subconjuntos de caracteres
				if(palavra_vetor[i].equals(palavra_vetor[j]) && i != j && j > i && j - i > 1) {
					
					// FOR usado obter os valores do vetor e inserir em uma string.
					for (int x = i; x <= j; x++) {
						meia_palavra += palavra_vetor[x];
					}
	
					// Inverte a String e insere em uma nova variavel
					palavra_invertida = new StringBuffer(meia_palavra).reverse().toString();
					
					// IF usado para comparar se as variaveis meia_palavra e palavra_invertida se são iguais
					if(meia_palavra.equals(palavra_invertida)) {
						meia_palavra = meia_palavra.substring(0, meia_palavra.length() - 1);
						
						// IF usado para validar se o subconjunto de caracter já existe na variavel 'anagrama' caso não, irá adicionar
						if(!anagrama.contains(meia_palavra) && !anagrama.contains(meia_palavra.substring(0, 2))) {
							//System.out.println("["+ i + ", "+ (j-1) + "] - Primeiro");
							anagrama.add(meia_palavra);
						}
						
						palavra_invertida = palavra_invertida.substring(1, palavra_invertida.length());
						
						// IF usado para validar se o subconjunto de caracter já existe na variavel 'anagrama' caso não, irá adicionar
						if(!anagrama.contains(palavra_invertida) && !anagrama.contains(palavra_invertida.substring(0, 2))) {
							//System.out.println("["+ (i+1) + ", "+ j + "] - Segundo");
							anagrama.add(palavra_invertida);
						}
					} else {
						meia_palavra ="";
						
						// FOR usado obter os valores do vetor e inserir em uma string.
						for (int x = i; x <= j; x++) {
							meia_palavra += palavra_vetor[x];
						}
						
						// IF usado para validar se o subconjunto de caracter já existe na variavel 'anagrama' caso não, irá adicionar
						if(!anagrama.contains(meia_palavra) && !anagrama.contains(meia_palavra.substring(0, 2))) {
							anagrama.add(meia_palavra);
						}
						//System.out.println("[["+ i + ", "+ (j-1) + "]" + "["+ (i+1) + ", "+ j + "]]");
					}
					meia_palavra = "";
				}
			}
		}
		
		System.out.println("Número de pares de Substring: " + anagrama.size());
		scanner.close();
	}
}
