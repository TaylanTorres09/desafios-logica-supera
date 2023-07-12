package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class SegundoDesafio {
	
	public static Map<String, Integer> quantityNotes(Double value) {
		Map<String, Integer> notes = new HashMap<>();
		notes.put("houndred", 0);
		notes.put("fifty", 0);
		notes.put("twenty", 0);
		notes.put("ten", 0);
		notes.put("five", 0);
		notes.put("two", 0);
		notes.put("one", 0);
		notes.put("fiftyCent", 0);
		notes.put("twentyFiveCent", 0);
		notes.put("tenCent", 0);
		notes.put("fiveCent", 0);
		notes.put("oneCent", 0);
		while(value > 0) {			
			if(value - 100 >= 0) {
				int houndredNotes = (int) (value/100) ;
				notes.put("houndred", houndredNotes);
				value -= houndredNotes * 100;
			} else if(value - 50 >= 0) {
				notes.put("fifty", 1);
				value -= 50;
			} else if(value - 20 >= 0) {
				int twenty = (value - 40 >= 0) ? 2 : 1;
				notes.put("twenty", twenty);
				value -= (20*twenty);
			} else if(value - 10 >= 0) {
				notes.put("ten", 1);
				value -= 10;
			} else if(value - 5 >= 0) {
				notes.put("five", 1);
				value -= 5;
			} else if(value - 2 >= 0) {
				int two =  (value - 4 >= 0) ? 2 : 1;
				notes.put("two", two);
				value -= (two*2);
			} else if(value - 1 >= 0) {
				notes.put("one", 1);
				value -= 1;
			} else if(value - 0.50 >= 0) {
				notes.put("fiftyCent", 1);
				value -= 0.5;
			} else if(value - 0.25 >= 0) {
				notes.put("twentyFiveCent", 1);
				value -= 0.25;
			} else if(value - 0.10 >= 0) {
				int tenCent = (value - 0.20 >= 0) ? 2 : 1; 
				notes.put("tenCent", tenCent);
				value -= 0.10 * tenCent;
			} else if(value - 0.05 >= 0) {
				notes.put("fiveCent", 1);
				value -= 0.05;
			} else {
				double oneCent = value/0.01;
				int one = (int)oneCent;
				notes.put("oneCent", one);
				value = 0.00;
			}
		}
		
		return notes;
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		BigDecimal value = new BigDecimal(sc.nextDouble()).setScale(2, RoundingMode.HALF_UP);
		
		Map<String, Integer> notes = quantityNotes(value.doubleValue());
		
		System.out.println("NOTAS:");
		System.out.printf("%d	notas(s)	de	R$	100.00 %n", notes.get("houndred"));
		System.out.printf("%d	notas(s)	de	R$	 50.00 %n", notes.get("fifty"));
		System.out.printf("%d	notas(s)	de	R$	 20.00 %n", notes.get("twenty"));
		System.out.printf("%d	notas(s)	de	R$	 10.00 %n", notes.get("ten"));
		System.out.printf("%d	notas(s)	de	R$	  5.00 %n", notes.get("five"));
		System.out.printf("%d	notas(s)	de	R$	  2.00 %n", notes.get("two"));
		
		System.out.println("Moedas:");
		System.out.printf("%d	moeda(s)	de	R$	  1.00 %n", notes.get("one"));
		System.out.printf("%d	moeda(s)	de	R$	  0.50 %n", notes.get("fiftyCent"));
		System.out.printf("%d	moeda(s)	de	R$	  0.25 %n", notes.get("twentyFiveCent"));
		System.out.printf("%d	moeda(s)	de	R$	  0.10 %n", notes.get("tenCent"));
		System.out.printf("%d	moeda(s)	de	R$	  0.05 %n", notes.get("fiveCent"));
		System.out.printf("%d	moeda(s)	de	R$	  0.01 %n", notes.get("oneCent"));
		
		sc.close();

	}

}
