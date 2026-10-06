public class StringOperations {
    public static void main(String[] args) {
        String s = "Object Oriented Programming";

        System.out.println("Length: " + s.length());
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Lower: " + s.toLowerCase());
        System.out.println("charAt(7): " + s.charAt(7));
        System.out.println("indexOf(\"Oriented\"): " + s.indexOf("Oriented"));
        System.out.println("substring(7, 15): " + s.substring(7, 15));
        System.out.println("replace: " + s.replace("Programming", "Lab"));
        System.out.println("equals: " + s.equals("object oriented programming"));
        System.out.println("equalsIgnoreCase: " + s.equalsIgnoreCase("object oriented programming"));

        String word = "level";
        String rev = new StringBuilder(word).reverse().toString();
        System.out.println(word + (word.equals(rev) ? " is" : " is not") + " a palindrome");

        String text = "  java  ";
        System.out.println("[" + text.trim() + "]");

        String csv = "apple,banana,mango";
        for (String f : csv.split(",")) System.out.println(f);
    }
}
