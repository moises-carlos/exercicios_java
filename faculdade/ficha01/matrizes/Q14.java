package matrizes;

import java.util.Scanner;

public class Q14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] nomes = new String[n];
        String[][] presencas = new String[n][30];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = sc.nextLine();
            System.out.println("Digite a presença do aluno (30 dias - P/F):");
            for (int j = 0; j < 30; j++) {
                presencas[i][j] = sc.nextLine().trim();
            }
        }

        System.out.println("\nAlunos reprovados por falta:");
        for (int i = 0; i < n; i++) {
            int faltas = 0;
            StringBuilder diasFaltas = new StringBuilder();

            for (int j = 0; j < 30; j++) {
                if (presencas[i][j].equals("F")) {
                    faltas++;
                    diasFaltas.append((j + 1)).append(" ");
                }
            }

            if (faltas > 10) {
                System.out.println(nomes[i] + " - dias: " + diasFaltas.toString());
            }
        }

        sc.close();
    }
}
