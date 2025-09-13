
import java.util.Scanner;

public class Q03 {

    static double calculaMediaTemperaturas(double[] temps) {
        double somaVetor = 0.0;

        for (int i = 0; i < temps.length; i++) {
            somaVetor += temps[i];
        }
        return somaVetor / temps.length;
    }

    static int diasAcimaMedia(double[] temps) {
        int diasAcimaMedia = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > calculaMediaTemperaturas(temps)) {
                diasAcimaMedia++;
            }
        }
        return diasAcimaMedia;
    }

    static double menorTemperatura(double[] temps) {
        double menor = temps[0];
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < menor) {
                menor = temps[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturasRegistradas = new double[7];

        System.out.println("informe as temps registradas: ");

        for (int i = 0; i < temperaturasRegistradas.length; i++) {
            temperaturasRegistradas[i] = sc.nextDouble();
        }

        double mediaTemps = calculaMediaTemperaturas(temperaturasRegistradas);
        System.out.printf("A média das temperaturas: %.2f%n", mediaTemps);

        int diasAcimaMedia = diasAcimaMedia(temperaturasRegistradas);
        System.out.println("dias acima da média: " + diasAcimaMedia);

        double menorTemperatura = menorTemperatura(temperaturasRegistradas);
        System.out.println("A menor temperatura = " + menorTemperatura);

    }
}
