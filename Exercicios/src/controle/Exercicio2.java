package controle;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		// 2. Criar um programa informa se o ano atual é um ano bissexto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
		
		if(bissexto == true) { 
			System.out.println("É um ano bissexto");
		} else {
			System.out.println("Não é um ano bissexto");
		}
		
		entrada.close();
	}
}
