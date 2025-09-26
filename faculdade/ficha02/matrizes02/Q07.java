package matrizes02;

import java.util.Scanner;

public class Q07 {

    static double[] totalPorProduto(double[][] vendas) {

        double[] totalProduto = new double[3];

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                totalProduto[i] += vendas[i][j];
            }
        }
        return totalProduto;
    }

    static double[] totalPorTrimestre(double[][] vendas) {
        double[] totalProdutoPorTrimestre = new double[4];

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                totalProdutoPorTrimestre[j] += vendas[i][j];
            }
        }

        return totalProdutoPorTrimestre;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] vendas = new double[3][4];
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                vendas[i][j] = sc.nextDouble();
            }
        }

        double[] totalSimestre = totalPorTrimestre(vendas);
        double[] totalProdutos = totalPorProduto(vendas);

        System.out.println("TOTAL POR PRODUTO: ");
        for (int i = 0; i < totalProdutos.length; i++) {
            System.out.print(totalProdutos[i] + " ");
        }
        System.out.println();
        System.out.println("TOTAL POR TRIMESTRE: ");
        for (int i = 0; i < totalSimestre.length; i++) {
            System.out.print(totalSimestre[i] + " ");
        }


    }

}
