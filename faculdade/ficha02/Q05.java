
import java.util.Scanner;

public class Q05 {

    static int[] frequencia(int[] opinioes) {
        int[] contador = new int[5];
        for (int i = 0; i < opinioes.length; i++) {
            int voto = opinioes[i];
            contador[voto - 1]++;
        }
        for (int i = 0; i < contador.length; i++) {
            System.out.print(contador[i] + " ");
        }
        return contador;
    }

    static double satisfacaoMedia(int[] opinioes) {
        double soma = 0;
        for (int i = 0; i < opinioes.length; i++) {
            soma += opinioes[i];
        }
        return soma/opinioes.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] opinioes = new int[5];

        System.out.println("informe sua nota de avaliação: ");
        for (int i = 0; i < opinioes.length; i++) {
            opinioes[i] = sc.nextInt();
        }

        frequencia(opinioes);

        double media = satisfacaoMedia(opinioes);
        System.out.println();
        System.out.println("a média das opinião: " + media);
    }
}
