package fundamentos;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius para conversão:");
		double celsius = entrada.nextDouble();
		double calc1 = 	celsius * 1.8;
		double resultado = calc1 + 32;
		
		System.out.println(resultado);
		
		entrada.close();
	}
}
