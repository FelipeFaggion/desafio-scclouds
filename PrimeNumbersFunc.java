package desafio_scclouds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersFunc {

	public static void main(String[] args) {
		
		List<Integer> primeNumbers = new ArrayList<>();
		
		System.out.println("Insira até onde deseja calcular os primos");
		
		try (Scanner scanner = new Scanner(System.in)) {
			if (scanner.hasNextInt()) {
				int number = scanner.nextInt(); 
				
				if (number <= 1 ) {
					System.out.println("Valor inválido");
					return;
				}
				
				for (int k=2; k<=number; k++) {
					
					boolean isPrimeNumber = true;
					for (int i=2; i <= k/2; i++) {
						if (k % i == 0) {
							isPrimeNumber = false;
							break;
						}
					}
					
					if (isPrimeNumber) {
						primeNumbers.add(k);
					}
				}
				System.out.println("Numeros primos de 1 até " + number + " :");
				for(int j: primeNumbers) {
					System.out.println(j);
				}
			} else {
				System.out.println("Por favor, insira apenas números inteiros positivos maiores que 1");
				return;
			}
		}
		
		
	}
}