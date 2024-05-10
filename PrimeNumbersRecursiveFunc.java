package desafio_scclouds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersRecursiveFunc {

    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        
        System.out.println("Insira até onde deseja calcular os primos");
        
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                
                if (number <= 1) {
                    System.out.println("Valor inválido");
                    return;
                }
                
                calculatePrimes(number, 2, primeNumbers);
                
                System.out.println("Números primos de 1 até " + number + " :");
                for (int j : primeNumbers) {
                    System.out.println(j);
                }
            } else {
                System.out.println("Por favor, insira apenas números inteiros positivos maiores que 1");
                return;
            }
        }
    }

    public static void calculatePrimes(int number, int current, List<Integer> primeNumbers) {
        if (current > number) {
            return;
        }

        boolean isPrimeNumber = true;
        for (int i=2; i <= current/2; i++) {
            if (current % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if (isPrimeNumber) {
            primeNumbers.add(current);
        }
        
        calculatePrimes(number, current + 1, primeNumbers);
    }

}