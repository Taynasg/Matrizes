//6. Faça um programa para jogar o jogo da velha. O programa deve 
//permitir que dois jogadores façam uma partida do jogo da velha,
//usando o computador para ver o tabuleiro. Cada jogador vai
//alternadamente informando a posição onde deseja colocar a sua
//peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
//determinar automaticamente quando o jogo terminou e quem foi o
//vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
//deve atualizar a situação do tabuleiro na tela.

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char[][] jogo = new char[3][3];

		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		char jogador1 = 'X';
		char jogador2 = 'O';
		boolean linhaValida = false;
		boolean colunaValida = false;
		
		for (int jogadas = 0; jogadas<=9;i++) {
		
			// Faz com que o jogador repita a jogada enquanto ela não for válida
			do {
				System.out.println("Jogador 1, escolha a linha: ");
				System.out.println("linha 1");
				System.out.println("linha 2");
				System.out.println("linha 3");

				// Recebe as informações de posição escolhida do jogador1
				i = leia.nextInt();

				// Valida a escolha da linha do jogador 1

				if (i > 0 && i <= 3) {
					linhaValida = true;

				} else {
					System.out.println("Opção inválida, tente novamente.");
				}

			} while (!linhaValida);

			do {
				System.out.println("Jogador 1, escolha a coluna: ");
				System.out.println("coluna 1");
				System.out.println("coluna 2");
				System.out.println("coluna 3");
				j = leia.nextInt();

				// Valida a escolha da coluna do jogador 1

				if (j > 0 && j <= 3) {
					colunaValida = true;

				} else {
					System.out.println("Opção inválida, tente novamente.");
				}

			} while (!colunaValida);

			// Verifica se a opção está preenchida ou não.
			i--;
			j--;
			if (jogo[i][j] == 'x' || jogo[i][j] == 'o') {
				System.out.println("Este campo já está ocupado, tente novamente");
			} else {
				jogo[i][j] = 'X';
			}

			for (i = 0; i < jogo.length; i++) {
				for (j = 0; j < jogo[i].length; j++) {
					System.out.print(jogo[i][j] + " | ");
				}
				System.out.println();
			}
			System.out.println();

			do {
				System.out.println("Jogador 2, escolha a linha: ");
				System.out.println("linha 1");
				System.out.println("linha 2");
				System.out.println("linha 3");

				// Recebe as informações de posição escolhida do jogador2

				k = leia.nextInt();

				// Valida a escolha do jogador 2

				if (k > 0 && k <= 3) {
					linhaValida = true;

				} else {
					System.out.println("Opção inválida, tente novamente.");
				}
			} while (!linhaValida);

			do {
				System.out.println("Jogador 2, escolha a coluna: ");
				System.out.println("coluna 1");
				System.out.println("coluna 2");
				System.out.println("coluna 3");
				l = leia.nextInt();

				if (l > 0 && l <= 3) {
					colunaValida = true;

				} else {
					System.out.println("Opção inválida, tente novamente.");
				}
			} while (!colunaValida);

			// Verifica se a opção está preenchida ou não.
			k--;
			l--;
			if (jogo[k][l] == 'X' || jogo[k][l] == 'O') {
				System.out.println("Este campo já está ocupado, tente novamente");
			} else {
				jogo[k][l] = 'O';
			}

			// imprimir tabuleiro
			for (k = 0; k < jogo.length; k++) {
				for (l = 0; l < jogo[k].length; l++) {
					System.out.print(jogo[k][l] + " | ");
				}
				System.out.println();
			}

		}
	}
}