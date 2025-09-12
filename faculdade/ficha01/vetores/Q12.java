package vetores;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int count = 0;

        while (count < 10) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            boolean existe = false;
            for (int i = 0; i < count; i++) {
                if (numeros[i] == num) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                System.out.println("Número já digitado, digite outro.");
            } else {
                numeros[count] = num;
                count++;
            }
        }

        System.out.print("Números digitados: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}
