public class MethodBasics {
    static int square(int n) {
        return n * n;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Victor");
        System.out.println("square(9) = " + square(9));
        System.out.println("max(14, 27) = " + max(14, 27));
        System.out.println("isPrime(29) = " + isPrime(29));
        System.out.println("factorial(6) = " + factorial(6));
    }
}
