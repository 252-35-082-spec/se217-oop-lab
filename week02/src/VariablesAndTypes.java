public class VariablesAndTypes {
    public static void main(String[] args) {
        int roll = 82;
        double marks = 87.5;
        char grade = 'A';
        boolean passed = true;
        String student = "Victor";
        final double PI = 3.1416;

        System.out.println(student + " | roll " + roll + " | marks " + marks);
        System.out.println("Grade: " + grade + ", passed: " + passed);
        System.out.println("PI = " + PI);

        int x = 10;
        double y = x;            // implicit widening
        int z = (int) 9.99;      // explicit narrowing, drops decimal
        System.out.println(y + " " + z);
    }
}
