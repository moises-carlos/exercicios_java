package matrizes;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Somar matrizes");
        System.out.println("2 - Subtrair A - B");
        System.out.println("3 - Somar constante a A");
        System.out.println("4 - Imprimir matrizes");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        C[i][j] = A[i][j] - B[i][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.print("Digite a constante: ");
                int k = sc.nextInt();
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        A[i][j] += k;
                        System.out.print(A[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 4:
                System.out.println("Matriz A:");
                for (int[] linha : A) {
                    for (int v : linha) System.out.print(v + " ");
                    System.out.println();
                }
                System.out.println("Matriz B:");
                for (int[] linha : B) {
                    for (int v : linha) System.out.print(v + " ");
                    System.out.println();
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
