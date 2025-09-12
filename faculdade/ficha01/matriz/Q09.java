package matriz;

import java.util.HashSet;
import java.util.Random;

public class Q09 {
     public static void main(String[] args) {
        Random rand = new Random();
        int[][] cartela = new int[5][5];
        HashSet<Integer> usados = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num;
                do {
                    num = rand.nextInt(100); 
                } while (usados.contains(num));
                usados.add(num);
                cartela[i][j] = num;
            }
        }

        System.out.println("Cartela de Bingo:");
        for (int[] linha : cartela) {
            for (int n : linha) {
                System.out.printf("%2d ", n);
            }
            System.out.println();
        }
    }
}
