package matrizes02;

import java.util.Scanner;

public class Q06 {

    static boolean venceu(char[][] tabuleiro, char jogador) {

        int n = tabuleiro.length;

        for (int i = 0; i < n; i++) {
            boolean linhaCompleta = true;
            for (int j = 0; j < n; j++) {
                if (tabuleiro[i][j] != jogador) {
                    linhaCompleta = false;
                    break;
                }
            }
            if (linhaCompleta) {
                System.out.println("Jogador " + jogador + " venceu na linha " + i);
                return true;
            }
        }

        for (int j = 0; j < n; j++) {
            boolean colunaCompleta = true;
            for (int i = 0; i < n; i++) {
                if (tabuleiro[i][j] != jogador) {
                    colunaCompleta = false;
                    break;
                }
            }
            if (colunaCompleta) {
                System.out.println("Jogador " + jogador + " venceu na coluna " + j);
                return true;
            }
        }

        boolean diagonalPrincipal = true;
        for (int i = 0; i < n; i++) {
            if (tabuleiro[i][i] != jogador) {
                diagonalPrincipal = false;
                break;
            }
        }
        if (diagonalPrincipal) {
            System.out.println("Jogador " + jogador + " venceu na diagonal");
            return true;
        }

        boolean diagonalSecundaria = true;
        for (int i = 0; i < n; i++) {
            if (tabuleiro[i][n - 1 - i] != jogador) {
                diagonalSecundaria = false;
                break;
            }
        }
        if (diagonalSecundaria) {
            System.out.println("Jogador " + jogador + " venceu na diagonal");
            return true;
        }

        return false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiroExemplo = new char[3][3];

        System.out.println("JOGO DA VELHA");
        System.out.println("==============================");

        for (int i = 0; i < tabuleiroExemplo.length; i++) {
            for (int j = 0; j < tabuleiroExemplo.length; j++) {
                System.out.print("O que deseja joga na linha " + i + " coluna " + j + " (X ou O): ");
                tabuleiroExemplo[i][j] = sc.next().charAt(0);
            }
        }
        for (int i = 0; i < tabuleiroExemplo.length; i++) {
            for (int j = 0; j < tabuleiroExemplo.length; j++) {
                System.out.print(tabuleiroExemplo[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Qual jogador vc deseja verificar se ganhou (X ou O)? ");
        char jogador = sc.next().charAt(0);
        boolean vencedor = venceu(tabuleiroExemplo, jogador);

        if (!vencedor) {
            System.out.println("O jogador " + jogador + " perdeu!");
        } else {
            System.out.println(vencedor);
        }
    }
}
