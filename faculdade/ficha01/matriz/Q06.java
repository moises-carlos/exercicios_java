package matriz;

public class Q06 {

    public static void main(String[] args) {
        int[][] A = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    A[i][j] = 2 * i + 7 * j;
                } else if (i == j) {
                    A[i][j] = 3 * i * i - 1;
                } else {
                    A[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
