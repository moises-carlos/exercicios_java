package matrizes;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int[] vetor = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite valor [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
                vetor[j] += mat[i][j];
            }
        }

        System.out.print("Vetor resultante: ");
        for (int v : vetor) {
            System.out.print(v + " ");
        }

        sc.close();
    }
}
