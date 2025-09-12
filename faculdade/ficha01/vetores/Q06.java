package vetores;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        String[] nome = new String[20];
        int[] idade = new int[20];

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Informe seu nome: ");
            nome[i] = sc.nextLine();

            System.out.println("Informe sua idade: ");
            idade[i] = sc.nextInt();

            sc.nextLine();
        }

        int soma = 0;
        for (int i = 0; i < idade.length; i++) {
            soma += idade[i];
        }
        media = soma / 20.0;

        System.out.printf("A média das idades é: %.2f\n", media);

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > media) {
                System.out.println("Os nomes com idade acima da média é: " + nome[i]);
            }
        }
        sc.close();
    }
}
