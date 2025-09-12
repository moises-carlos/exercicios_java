package vetores;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[5];
        int[] y = new int[5];

        System.out.println("Digite 5 elementos para o vetor x:");
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Digite 5 elementos para o vetor y:");
        for (int i = 0; i < 5; i++) {
            y[i] = sc.nextInt();
        }

        int[] soma = new int[5];
        System.out.println("Soma entre x e y:");
        for (int i = 0; i < 5; i++) {
            soma[i] = x[i] + y[i];
            System.out.print(soma[i] + " ");
        }
        System.out.println();

        int[] produto = new int[5];
        System.out.println("Produto entre x e y:");
        for (int i = 0; i < 5; i++) {
            produto[i] = x[i] * y[i];
            System.out.print(produto[i] + " ");
        }
        System.out.println();

        Set<Integer> diferenca = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            if (!contém(y, x[i])) {
                diferenca.add(x[i]);
            }
            if (!contém(x, y[i])) {
                diferenca.add(y[i]);
            }
        }
        System.out.println("Diferença entre x e y:");
        for (int num : diferenca) {
            System.out.print(num + " ");
        }
        System.out.println();

        Set<Integer> interseccao = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            if (contém(y, x[i])) {
                interseccao.add(x[i]);
            }
        }
        System.out.println("Interseção entre x e y:");
        for (int num : interseccao) {
            System.out.print(num + " ");
        }
        System.out.println();

        Set<Integer> uniao = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            uniao.add(x[i]);
            uniao.add(y[i]);
        }
        System.out.println("União entre x e y:");
        for (int num : uniao) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static boolean contém(int[] vetor, int valor) {
        for (int i : vetor) {
            if (i == valor) {
                return true;
            }
        }
        return false;
    }
}
