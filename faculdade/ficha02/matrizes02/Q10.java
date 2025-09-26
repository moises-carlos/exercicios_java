package matrizes02;

public class Q10 {
    static int contarInimigos(int[][] mapa) {
        int contadorInimigosComuns = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 1) {
                    contadorInimigosComuns++;
                }
            }
        }
        return contadorInimigosComuns;
    }

    static boolean haIninimigosNaDiagonal(int[][] mapa) {
        boolean haInimigos = true;

        for (int i = 0; i < mapa.length; i++) {
            if (mapa[i][i] == 0) {
                break;
            }
        }
        if (haInimigos) {
            return true;
        }
        return false;
    }

    static int[] posicaoDoChefao(int[][] mapa) {
        int[] vetorPosicao = new int[2];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 9) {
                    vetorPosicao[0] = i;
                    vetorPosicao[1] = j;
                }
            }
        }
        return vetorPosicao;
    }


    public static void main(String[] args) {

        {
            int[][] mapa = new int[10][10];
            mapa[2][2] = 1;
            mapa[5][5] = 9;
            mapa[0][0] = 1;
            mapa[9][9] = 1;

            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    System.out.print(mapa[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            int inimigosComuns = contarInimigos(mapa);
            System.out.println("contarInimigos = " + inimigosComuns);
            boolean hainimigos = haIninimigosNaDiagonal(mapa);
            if (hainimigos) {
                System.out.println("há inimigo na diagonal? sim");
            } else {
                System.out.println("há inimigo na diagonal? não");
            }
            int[] v = posicaoDoChefao(mapa);
            System.out.print("posição do chefão = " + "[ " + v[0] + ", " + v[1] + " ]");
        }
    }
}
