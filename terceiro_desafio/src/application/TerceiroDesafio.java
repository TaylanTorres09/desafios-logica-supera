package application;

import java.util.Scanner;

public class TerceiroDesafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do array: ");
		int lengthArr = sc.nextInt();
		
		// criando array
		int arr[] = new int[lengthArr];
		
		System.out.print("Digite o valor do alvo: ");
		int k = sc.nextInt();
		
		for(int i = 0; i < lengthArr; i++) {
			System.out.printf("Digite o %d° valor: ", i+1);
			arr[i] = sc.nextInt();
		}
		
		int matchK = 0;
		
		for(int i: arr) {
			for(int j: arr) {
				if(i - j == k) {
					matchK ++;
				}
			}
		}
		
		System.out.println();
		System.out.printf("O número de pares que satisfazem o critério: %d", matchK);
		
		sc.close();

	}

}
