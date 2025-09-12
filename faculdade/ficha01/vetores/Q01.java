package vetores;

public class Q01 {

    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = 1;
        a[1] = 0;
        a[2] = 5;
        a[3] = -2;
        a[4] = -5;
        a[5] = 7;

        int soma = a[0] + a[1] + a[5];

        a[4] = 100;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("resultado da soma: " + soma);
    }
}
