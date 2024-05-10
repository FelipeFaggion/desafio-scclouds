package desafio_scclouds;

import java.util.Scanner;

public class FibonacciRecursiveFunc {

	//Criando um array de "memória" para salvar resultados e evitar de chamar multiplas vezes a função
	//sem necessidade
	private static long[] fibonacciMemory;
	
	public static void main(String[] args) {
		System.out.println("Insira um Número:");
		try (Scanner scanner = new Scanner(System.in)) {
			if  (scanner.hasNextInt()) {
				int number = scanner.nextInt();
				
				if (number < 0 ) {
					System.out.println("Valor inválido");
					return;
				}
				fibonacciMemory = new long[number+1];
				System.out.println(recursiveFibonacci(number));
			} else {
				System.out.println("Por favor, insira apenas números inteiros positivos");
				return;
			}
		}
	}

	private static long recursiveFibonacci(int n) {
		if (n <= 1) {
			return  n;
		}
		
		//Checando se o resultado para 'n' já foi calculado e salvo.
		if (fibonacciMemory[n] != 0) {
			return fibonacciMemory[n];
		}
			
		long fibonacciNumberN = (recursiveFibonacci(n-1) + recursiveFibonacci(n-2));
		fibonacciMemory[n] = fibonacciNumberN; //salvando resultado na memória
		
		return fibonacciNumberN;
	}
	
}