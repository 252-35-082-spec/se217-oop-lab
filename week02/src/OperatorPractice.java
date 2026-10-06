public class OperatorPractice {
    public static void main(String[] args) {
        int a = 17, b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("real a / b = " + ((double) a / b));

        System.out.println("a > b : " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("&& : " + (a > 10 && b > 10));
        System.out.println("|| : " + (a > 10 || b > 10));
        System.out.println("!  : " + !(a > b));

        int c = 5;
        System.out.println(c++ + " then " + c);
        System.out.println(++c + " then " + c);
        c += 10;
        System.out.println("c after += 10: " + c);
    }
}
