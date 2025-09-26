package recursao;

public class Q13 {

    public static int potencia(int x, int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Expoente não pode ser negativo.");
        }

        if (n == 0) {
            return 1;
        }

        return x * potencia(x, n - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int expoente = 4;
        System.out.println(base + "^" + expoente + " = " + potencia(base, expoente));

        base = 5;
        expoente = 3;
        System.out.println(base + "^" + expoente + " = " + potencia(base, expoente));

        base = 7;
        expoente = 0;
        System.out.println(base + "^" + expoente + " = " + potencia(base, expoente));
    }
}
