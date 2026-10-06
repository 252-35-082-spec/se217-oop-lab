public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 100; i++) sum += i;
        System.out.println("Sum 1..100 = " + sum);

        int num = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
