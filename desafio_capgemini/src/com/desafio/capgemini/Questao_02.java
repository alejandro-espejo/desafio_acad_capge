package com.desafio.capgemini;
import java.util.Scanner;

public class Questao_02 {

	public static void main(String[] args) {
		// Cria��o de uma instancia da classe Scanner para efetuar a leitura de dados no console.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		String senha = scanner.next();
		
		// Variavel boolean usada para validar se senha possui numero
		boolean possui_numero = false;
		
		// Variavel boolean usada para validar se senha possui caracter especial
		boolean possui_caracter_especial = false;
		
		// Variavel boolean usada para validar se senha possui letra maiuscula
		boolean possui_letra_maiusculo = false;
		
		// Variavel boolean usada para validar se senha possui letra minuscula
		boolean possui_letra_minusculo = false;
		
		// Retorna verdadeiro se houver letra maiuscula
		possui_letra_maiusculo = !senha.equals(senha.toLowerCase());
		
		// Retorna verdadeiro se houver letra minuscula
		possui_letra_minusculo = !senha.equals(senha.toUpperCase());
		
		// FOR usado para verificar se a senha possui um digito(n�mero) e se possui um caracter especial
		for (int i = 0; i < senha.length(); i++) {
			
			if (Character.isDigit(senha.charAt(i))) {
				possui_numero = true;
			}
			
			if (!Character.isLetter(senha.charAt(i)) && !Character.isDigit(senha.charAt(i))) {
				possui_caracter_especial = true;
			}
		}
		
		// Caso a senha atenda os requisitos, ir� retornar: 'Senha forte e segura!', caso n�o, ir� retornar o que � necess�rio para a senha correta.
		if (senha.length() >= 6 && possui_letra_maiusculo && possui_letra_minusculo && possui_numero && possui_caracter_especial) {
			System.out.println("Senha forte e segura!");
		} else {
			System.out.println("A senha deve conter 6 caracteres, faltam: "+ (6 - senha.length()) + " caracteres.");
			if (!possui_letra_maiusculo) System.out.println("� necess�rio ter ao menos uma letra mai�scula!");
			if (!possui_letra_minusculo) System.out.println("� necess�rio ter ao menos uma letra min�scula!");
			if (!possui_numero) System.out.println("� necess�rio ter ao menos um n�mero!");
			if (!possui_caracter_especial) System.out.println("� necess�rio ter ao menos um caracter especial!");
		}
		
		scanner.close();
	}
}
