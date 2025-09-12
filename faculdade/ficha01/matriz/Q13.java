package matriz;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = -1;
            }
        }

        mostrarAssentos(matriz);
        System.out.println();
        System.out.println("Informe a quantidade de ingressos que deseja comprar: ");
        int ingressos = sc.nextInt();

        int fileira, coluna;
        for (int i = 0; i < ingressos; i++) {

            while (true) {

                System.out.println("informe a fileira (0 a 9): ");
                fileira = sc.nextInt();
                System.out.println("informe a coluna (0 a 9): ");
                coluna = sc.nextInt();


                if (fileira < 0 || fileira > 9 || coluna < 0 || coluna > 9) {
                    System.out.println("Posição inválida! Tente novamente.");
                    continue;
                }
                if (matriz[fileira][coluna] == -1) {
                    matriz[fileira][coluna] = 1;
                    System.out.println("Assento vendido com sucesso!");
                    break;
                } else {
                    System.out.println("Assento já vendido! escolha outro");
                }
            }
        }
        mostrarAssentos(matriz);
        sc.close();
    }


    public static void mostrarAssentos(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == -1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }

    }
}