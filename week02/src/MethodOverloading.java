public class MethodOverloading {
    static int add(int a, int b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }
    static double add(double a, double b) { return a + b; }

    static double area(double radius) { return Math.PI * radius * radius; }
    static double area(double length, double width) { return length * width; }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
        System.out.println(add(2.5, 3.5));
        System.out.printf("Circle area: %.2f%n", area(3));
        System.out.println("Rectangle area: " + area(4, 6));
    }
}
