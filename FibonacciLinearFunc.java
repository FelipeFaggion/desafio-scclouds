package desafio_scclouds;

import java.util.Scanner;

public class FibonacciLinearFunc {

	private static int linearFibonacci (int n){
		int previous = 0;
		int current = 1;
		int next;
		
		if (n == 0) return 0;
		else {
			for (int k = 1; k<n; k ++) {
				next = current + previous;
				previous = current;
				current = next;
			}
			return current;
		}
	}	
	
	public static void main(String[] args) {
		System.out.println("Insira um número:");
		try (Scanner scanner = new Scanner(System.in)) {
			if  (scanner.hasNextInt()) {
				int number = scanner.nextInt();
				
				if (number < 0 ) {
					System.out.println("Valor inválido");
					return;
				}
				System.out.println(linearFibonacci(number));
			} else {
				System.out.println("Por favor, insira apenas números inteiros positivos");
				return;
			}
		}
	}

}