package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> decipheredPhrases = new ArrayList<>();

		System.out.print("Digite a quantidade de casos teste: ");
		int cases = sc.nextInt();

		for(int i = 1; i <= cases; i++) {
			System.out.print("Coloque a "+ i + "° frase: ");
			String phrase = sc.next();
			phrase += sc.nextLine();
			int lengthPhrase = phrase.length();
			while(lengthPhrase < 2 || lengthPhrase > 100) {
				System.out.print("Frase com characteres fora do limite min 2 máx 100, digite novamente a "+ i + "° frase: ");
				phrase = sc.next();
				lengthPhrase = phrase.length();
			}
			String firstHalf = new StringBuilder(phrase.substring(0, lengthPhrase / 2)).reverse().toString();
			String lastHalf = new StringBuilder(phrase.substring(lengthPhrase / 2, lengthPhrase)).reverse().toString();

			String decipheredPhrase = firstHalf.concat(lastHalf).trim();
			
			decipheredPhrases.add(decipheredPhrase);
		}
		
		System.out.println();
		System.out.println("Frases Decifradas");
		
		for (String phrase : decipheredPhrases) {
			System.out.println(phrase);
		}

		sc.close();

	}

}
