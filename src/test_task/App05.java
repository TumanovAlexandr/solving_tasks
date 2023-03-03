package test_task;

public class App05 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
    }

    public static int singleNumber(int[] nums) {
        int uniqNum = 0;
        for (int idx : nums) {
            uniqNum ^= idx;
        }
        return uniqNum;
    }
}
