public class WhileLoopPractice {
    public static void main(String[] args) {
        int n = 12345, digitSum = 0, temp = n;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        System.out.println("Digit sum of " + n + " = " + digitSum);

        int rev = 0;
        temp = n;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse = " + rev);
    }
}
