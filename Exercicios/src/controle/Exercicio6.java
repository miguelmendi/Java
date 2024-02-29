package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
		
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando número entre 0 e 100");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Começou o jogo! Sera que você consegue me vencer?");
			tentativas = 0;
			
			do {
				tentativas++;
			    System.out.printf("Tentativa %d: ", tentativas);
			    numero = entrada.nextInt();
			    
			    if (numero > numeroSorteado) {

			        System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);

			       } else if (numero < numeroSorteado) {

			        System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);

			       } else {

			        System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
			        break;
			       }

			}while (tentativas != 10);

			   System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			   continuar = entrada.nextInt();

			
		}while(continuar != 0);
		
		entrada.close();                        
	}
}
