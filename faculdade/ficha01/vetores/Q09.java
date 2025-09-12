package vetores;

public class Q09 {

    public static void main(String[] args) {
        int[] vetor = new int[100];
        int count = 0;
        int num = 1;

        while (count < 100) {
            if (num % 7 != 0 && num % 10 == 7) {
                vetor[count++] = num;
            }
            num++;
        }

        System.out.println("Vetor com os 100 primeiros números que não são múltiplos de 7 e terminam com 7:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
