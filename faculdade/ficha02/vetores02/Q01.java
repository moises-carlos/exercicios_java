package vetores02;

import java.util.Scanner;

public class Q01 {

    public static double[] reajustarPrecos(double[] preco, double percentual) {
        double[] precoReajustado = new double[10];

        for (int i = 0; i < preco.length; i++) {
            precoReajustado[i] = preco[i] + (percentual / 100) * preco[i];
            System.out.print(precoReajustado[i] + " ");
        }

        return precoReajustado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = {100.0, 50.0, 75.0, 30.0, 200.0, 120.0, 60.0, 80.0, 90.0, 40.0};

        System.out.println("Informe o percentual de reajuste: ");
        double percentual = sc.nextDouble();

        System.out.print("Os valores com reajuste: ");
        reajustarPrecos(precos, percentual);
    }
}
