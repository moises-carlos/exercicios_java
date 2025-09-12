package matriz;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        int somaAcima = 0, somaAbaixo = 0, somaPrincipal = 0, somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite valor [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();

                if (i < j) somaAcima += mat[i][j];
                if (i > j) somaAbaixo += mat[i][j];
                if (i == j) somaPrincipal += mat[i][j];
                if (i + j == 2) somaSecundaria += mat[i][j];
            }
        }

        System.out.println("Soma acima diagonal principal: " + somaAcima);
        System.out.println("Soma abaixo diagonal principal: " + somaAbaixo);
        System.out.println("Soma diagonal principal: " + somaPrincipal);
        System.out.println("Soma diagonal secundária: " + somaSecundaria);

        sc.close();
    }
}
