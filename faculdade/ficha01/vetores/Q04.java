package vetores;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe seu nome: ");
            nomes[i] = sc.nextLine();
        }
        System.out.println("nomes na ordem inversa: ");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.print(nomes[i] + " ");
        }
        sc.close();
    }
}
