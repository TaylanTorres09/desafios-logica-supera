package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();
		
		System.out.print("Digite a quantidade de números a serem inseridos: ");
		Integer N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.print("Digite o " + i + "° número: ");
			Integer num = sc.nextInt();
			while(num < 0) {
				System.out.println("Não permitido números negativos.");
				System.out.print("Digite o " + i + "° número: ");
				num = sc.nextInt();
			}
			if(num % 2 == 0) {
				evenNumbers.add(num);
			} else {
				oddNumbers.add(num);
			}
		}
		
		System.out.println("-".repeat(20));
		System.out.println("Saida:");
		
		Collections.sort(evenNumbers);
		evenNumbers.forEach(System.out::println);
		
		Collections.sort(oddNumbers, Collections.reverseOrder());
		oddNumbers.forEach(System.out::println);
		
		sc.close();

	}

}
