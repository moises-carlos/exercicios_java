package matrizes02;

public class Q09 {

    static int[] vitoriasPorTime(int[][] resultados) {
        int[] qtdVitoriasPorTimes = new int[4];
        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados[i].length; j++) {
                if (resultados[i][j] == 1) {
                    qtdVitoriasPorTimes[i]++;
                }
            }
        }

        return qtdVitoriasPorTimes;
    }

    static int[] timeInvicto(int[][] resultados) {
        int[] timesInvictos = new int[resultados.length];
        int index = 0;

        for (int i = 0; i < resultados.length; i++) {
            boolean invicto = true;
            for (int j = 0; j < resultados[i].length; j++) {
                if (resultados[i][j] == 0) { // ou -1 se for derrota
                    invicto = false;
                    break;
                }
            }
            if (invicto) {
                timesInvictos[index] = i;
                index++;
            }
        }

        return java.util.Arrays.copyOf(timesInvictos, index);
    }


    public static void main(String[] args) {
        int[][] resultados = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {1, 1, 0, 0}
        };
        int[] vitorias = vitoriasPorTime(resultados);

        System.out.print("vitorias = ");
        for (int vitoria : vitorias) {
            System.out.print(vitoria + ", ");
        }

        System.out.println();
        int[] invictos = timeInvicto(resultados);
        if (invictos.length == 0) {
            System.out.println("time invicto = nenhum");
        } else {
            System.out.print("Times invictos: ");
            for (int time : invictos) {
                System.out.print(time + " ");
            }
            System.out.println();

        }

    }
}