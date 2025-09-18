package matrizes02;

import java.util.Scanner;

public class Q08 {

    static int pontoMaisAlto(int[][] mapa) {
        int maisAlto = mapa[0][0];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] > maisAlto) maisAlto = mapa[i][j];
            }
        }
        return maisAlto;
    }

    static double mediaAltitude(int[][] mapa) {
        double soma = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                soma += mapa[i][j];
            }
        }
        return soma / (mapa.length * mapa[0].length);
    }

    static boolean ehPlanalto(int[][] mapa) {
        double media = mediaAltitude(mapa);
        int pontoAltos = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] >= media) {
                    pontoAltos++;
                }
            }
        }

        int totalDePontos = mapa.length * mapa[0].length;

        return pontoAltos >= (totalDePontos / 2.0);
      

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mapa = {{10, 12, 14, 11, 13}, {9, 11, 12, 10, 13}, {10, 10, 13, 14, 15}, {11, 13, 13, 12, 13}, {12, 14, 15, 13, 10}};

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
        int pontoMaisalto = pontoMaisAlto(mapa);
        System.out.println("ponto mais alto = " + pontoMaisalto);
        double media = mediaAltitude(mapa);
        System.out.println("média = " + media);
        boolean planalto = ehPlanalto(mapa);
        System.out.println("é planalto? " + planalto);
    }
}
