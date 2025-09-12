package vetores;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        double[] v = new double[n];
        double soma = 0;
        double media, somaQuadrados = 0;

        System.out.println("Digite 10 números para o vetor:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextDouble();
            soma += v[i];
        }

        media = soma / n;

        for (int i = 0; i < n; i++) {
            somaQuadrados += Math.pow(v[i] - media, 2);
        }

        double desvioPadrao = Math.sqrt(somaQuadrados / (n - 1));

        System.out.printf("O desvio padrão é: %.2f\n", desvioPadrao);
    }
}
