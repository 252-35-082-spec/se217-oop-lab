import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        String grade;

        if (marks > 100 || marks < 0) grade = "Invalid";
        else if (marks >= 80) grade = "A+";
        else if (marks >= 70) grade = "A";
        else if (marks >= 60) grade = "B";
        else if (marks >= 50) grade = "C";
        else if (marks >= 40) grade = "D";
        else grade = "F";

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
