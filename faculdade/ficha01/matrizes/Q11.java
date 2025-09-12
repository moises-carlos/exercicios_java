package matrizes;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] alunos = new double[5][4];
        double maiorNota = -1;
        int matriculaMaior = -1;
        double somaNotasFinais = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite matrícula do aluno " + (i + 1) + ": ");
            alunos[i][0] = sc.nextInt();
            System.out.print("Digite média das provas: ");
            alunos[i][1] = sc.nextDouble();
            System.out.print("Digite média dos trabalhos: ");
            alunos[i][2] = sc.nextDouble();

            alunos[i][3] = alunos[i][1] + alunos[i][2];
            somaNotasFinais += alunos[i][3];

            if (alunos[i][3] > maiorNota) {
                maiorNota = alunos[i][3];
                matriculaMaior = (int) alunos[i][0];
            }
        }

        System.out.println("Aluno com maior nota final: Matrícula " + matriculaMaior + " (Nota: " + maiorNota + ")");
        System.out.println("Média aritmética das notas finais: " + (somaNotasFinais / 5));

        sc.close();
    }
}
