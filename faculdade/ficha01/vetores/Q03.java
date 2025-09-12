package vetores;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            System.out.println("Informe um número: ");
            v[i] = sc.nextInt();
        }
        for (int i : v) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
