package week2;

import java.util.Scanner;

public class ClassPractice {

	public static void main(String[] args) {
		
		
		// Replace character on a Word
		String month = "January";
		int size = month.length();
		char[] c = month.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a') {
				System.out.println("*");
			} else {
				System.out.println(c[i]);
			}
		}
		
		String newMonth = month.replace("a", "*");
		
		System.out.println(month.replace("a", "*"));
		
		//
		
		// Do While vs While
		int num = 0;
		Scanner prompt = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number below: ");
			num = prompt.nextInt();
		} while (num < 10);
		
		while(num < 10) {
			System.out.println("Enter a number below: ");
			num = prompt.nextInt();
		}
	}

}
