package matriz;

import java.util.Random;

public class Q08 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] mat = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = rand.nextInt(20) + 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                mat[i][j] = 0;
            }
        }

       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
