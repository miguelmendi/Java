package fundamentos;

import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da base:");
		double base = scanner.nextDouble();
		
		System.out.println("Digite o valor da altura:");
		double altura = scanner.nextDouble();
		
		double area = (base * altura)/ 2;
		System.out.println("A área do triângulo é:" + area);
		
		scanner.close();
	}
}
