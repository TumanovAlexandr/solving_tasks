package test_task;

public class App29 {

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Test case 1:");
        System.out.println("Input: [1, 2, 3, 4]");
        System.out.println("Expected output: [24, 12, 8, 6]");
        System.out.println("Actual output: " + arrayToString(productExceptSelf(nums1)));
        System.out.println();

        // Test case 2
        int[] nums2 = {4, 3, 2, 1};
        System.out.println("Test case 2:");
        System.out.println("Input: [4, 3, 2, 1]");
        System.out.println("Expected output: [6, 8, 12, 24]");
        System.out.println("Actual output: " + arrayToString(productExceptSelf(nums2)));
        System.out.println();

        // Test case 3
        int[] nums3 = {1, 1, 1, 1};
        System.out.println("Test case 3:");
        System.out.println("Input: [1, 1, 1, 1]");
        System.out.println("Expected output: [1, 1, 1, 1]");
        System.out.println("Actual output: " + arrayToString(productExceptSelf(nums3)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
        }

        int suffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            prefixProduct[i] = suffixProduct * prefixProduct[i];
            suffixProduct = suffixProduct * nums[i];
        }
        return prefixProduct;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
