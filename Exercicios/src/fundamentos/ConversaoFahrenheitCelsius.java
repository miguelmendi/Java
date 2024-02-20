package fundamentos;

import java.util.Scanner;

public class ConversaoFahrenheitCelsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit");
		double F = entrada.nextDouble();
		
		double calc1 = (F - 32);
		double resultadoCelsius = calc1 / 1.8;
		
		System.out.printf("%.1f",resultadoCelsius);
		
		entrada.close();
	}
}
