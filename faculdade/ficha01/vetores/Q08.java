package vetores;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorResultado = new int[10];
        
        System.out.println("Digite os 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }

      
        System.out.println("Digite os 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }

       
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { 
                vetorResultado[i] = vetor1[i]; 
            } else { 
                vetorResultado[i] = vetor2[i]; 
            }
        }

        System.out.println("Vetor resultado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultado[i] + " ");
        }
    }
}
