public class StarPatterns {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Right triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        System.out.println("Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("Number pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}
