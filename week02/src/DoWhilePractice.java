import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin;
        do {
            System.out.print("Enter PIN (1234 to stop): ");
            pin = sc.nextInt();
        } while (pin != 1234);
        System.out.println("Access granted");
        sc.close();
    }
}
