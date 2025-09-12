package vetores;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("informe um número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.print("Os números ímpares: ");
        for (int i : numeros) {
            if (i % 2 == 1) {
                System.out.print(i + " - ");
            }
        }
        System.out.println();
        System.out.print("Os números pares: ");
        for (int i : numeros) {
            if (i % 2 == 0) {
                System.out.print(i + " - ");
            }
        }
        sc.close();
    }
}
