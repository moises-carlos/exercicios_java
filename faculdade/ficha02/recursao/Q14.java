package recursao;

public class Q14 {

  
    public static boolean ehPrimo(int n, int divisor) {
        if (n <= 1) {
            return false;
        }

        if (divisor > n / 2) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }
        return ehPrimo(n, divisor + 1);
    }

    public static void main(String[] args) {
        int num1 = 13;
        System.out.println("O número " + num1 + " é primo? " + ehPrimo(num1, 2)); 

        int num2 = 12;
        System.out.println("O número " + num2 + " é primo? " + ehPrimo(num2, 2));

        int num3 = 29;
        System.out.println("O número " + num3 + " é primo? " + ehPrimo(num3, 2));

        int num4 = 1;
        System.out.println("O número " + num4 + " é primo? " + ehPrimo(num4, 2)); 
    }
}