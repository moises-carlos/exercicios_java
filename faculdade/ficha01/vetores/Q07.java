package vetores;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] vetor1 = new int[20];
        int[] vetor2 = new int[20];
        int[] vetorIntercalado = new int[40];

        System.out.println("Digite os 20 números para o primeiro vetor:");
        for (int i = 0; i < 20; i++) {
            vetor1[i] = sc.nextInt();
        }

       
        System.out.println("Digite os 20 números para o segundo vetor:");
        for (int i = 0; i < 20; i++) {
            vetor2[i] = sc.nextInt();
        }

       
        int j = 0;
        for (int i = 0; i < 20; i++) {
            vetorIntercalado[j++] = vetor1[i];
            vetorIntercalado[j++] = vetor2[i];
        }

        System.out.println("Vetor intercalado:");
        for (int i = 0; i < vetorIntercalado.length; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
    }
}
