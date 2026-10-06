public class PrimitiveRanges {
    public static void main(String[] args) {
        System.out.println("byte   : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short  : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int    : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long   : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float  : " + Float.MAX_VALUE);
        System.out.println("double : " + Double.MAX_VALUE);

        int big = Integer.MAX_VALUE;
        big++;
        System.out.println("Overflow: " + big);
    }
}
