public class ArrayOperations {
    public static void main(String[] args) {
        int[] nums = {42, 7, 19, 88, 3, 56};

        int max = nums[0], min = nums[0], sum = 0;
        for (int v : nums) {
            if (v > max) max = v;
            if (v < min) min = v;
            sum += v;
        }
        System.out.println("Length: " + nums.length);
        System.out.println("Max: " + max + ", Min: " + min);
        System.out.println("Average: " + (double) sum / nums.length);

        System.out.print("Reversed: ");
        for (int i = nums.length - 1; i >= 0; i--) System.out.print(nums[i] + " ");
        System.out.println();

        int target = 19, index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) { index = i; break; }
        }
        System.out.println(target + " found at index " + index);
    }
}
