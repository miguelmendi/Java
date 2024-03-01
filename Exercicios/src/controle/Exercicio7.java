package controle;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 /**
		  * 7. Criar um programa que enquanto estiver recebendo números positivos,
		  * imprime no console a soma dos números inseridos, caso receba um número
		  * negativo, encerre o programa. Tente utilizar a estrutura do while.
		  */
		
		Scanner entrada = new Scanner(System.in);
		
		int somador = 0;
		int num = 0;
		
		while(num >= 0) {
				System.out.println("Digite um numero inteiro (ou negativo para sair)");
				num = entrada.nextInt();
				if(num >= 0) {
					somador += num;
					System.out.printf("\n Soma até o momento: %d\n", somador);
				}
		}
		
		entrada.close();
	}
}
