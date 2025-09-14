
import java.util.Scanner;

public class Q04 {

    static int contarNotasAcima(double[] notas, double limite) {
        int notasAcima = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > limite) {
                notasAcima++;
            }
        }
        return notasAcima;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        System.out.println("informe o limite que deseja: ");
        double limite = sc.nextDouble();

        System.out.println("informe as notas dos alunos: ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
        }

        int notasAcimaLimt = contarNotasAcima(notas, limite);

        System.out.println("notas acima do limite: " + notasAcimaLimt);

    }
}
