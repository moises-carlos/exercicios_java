package recursao;

public class Q12 {

    public static String decimalParaBinario(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Este método suporta apenas números não negativos.");
        }

        if (numero <= 1) {
            return Integer.toString(numero);
        }
        
        return decimalParaBinario(numero / 2) + (numero % 2);
    }

    public static void main(String[] args) {
        int num1 = 13;
        System.out.println("O número " + num1 + " em binário é: " + decimalParaBinario(num1)); 

        int num2 = 42;
        System.out.println("O número " + num2 + " em binário é: " + decimalParaBinario(num2)); 

        int num3 = 0;
        System.out.println("O número " + num3 + " em binário é: " + decimalParaBinario(num3)); 

        int num4 = 1;
        System.out.println("O número " + num4 + " em binário é: " + decimalParaBinario(num4)); 
    }
}