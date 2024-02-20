package fundamentos;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um número");
		double number = scanner.nextDouble();
		double numberQuadrado = Math.pow(number, 2);
		double numberCubo = Math.pow(number, 3);
		
		System.out.println("Número elevado ao quadrado = " + numberQuadrado);
		System.out.println("Número elevado ao cubo = " + numberCubo);
		
		
		scanner.close();
	}
}
