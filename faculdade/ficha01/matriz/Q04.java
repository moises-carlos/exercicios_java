package matriz;

import java.util.Scanner;

public class Q04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int maior = Integer.MIN_VALUE;
        int linha = -1, coluna = -1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Maior valor: " + maior + " na posição [" + linha + "][" + coluna + "]");
        sc.close();
    }
}
