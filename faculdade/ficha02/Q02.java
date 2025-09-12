
import java.util.Scanner;

public class Q02 {

   public static int[] contarVotos(int[] votos) {
        int[] candidatos = new int[5];
        int[] contagem = new int[candidatos.length];
        for (int i = 0; i < votos.length; i++) {
            int voto = votos[i];

            if (voto >= 0 && voto < contagem.length) {
                contagem[voto]++;
                System.out.print(contagem[i] + " ");
            } else {
                System.out.println("Aviso: Voto '" + voto + "' é inválido e foi descartado.");
            }
        }
        return contagem;
    }

    public static int vencedor(int[] contagem) {
        int vencedor = 0;
        int maior = 0;
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > maior) {
                maior = contagem[i];
                vencedor = i;
            }
        }
        System.out.print("o vencedor é: " + vencedor);

        return vencedor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = new int[5];
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Informe seu voto (0 a 4): ");
            votos[i] = sc.nextInt();
        }

        int[] contagemVotos = contarVotos(votos);
        System.out.println();
        vencedor(contagemVotos);

    }
}
