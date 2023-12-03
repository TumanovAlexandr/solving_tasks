package test_task;

public class HouseRobber {
//    Case1 : Don't rob the i-th house - then we can rob the i-1 th house...so we will have max money robbed till i-1 th house
//    Case 2 : Rob the i-th house - then we cann't rob the i-1 th house but we can rob i-2 th house....so we will have max money robbed till i-2 th house + money of i-th house.
//    Example:
//            1.) If the array is [1,5,3] then robber will rob the 1st index house because arr[1] > arr[0]+arr[2] (i.e., at last index, arr[i-1] > arr[i-2]+arr[i])
//            2.) If the array is [1,2,3] then robber will rob the 0th and 2nd index house because arr[0]+arr[2] > arr[1] (i.e., at last index, arr[i-2] + arr[i] > arr[i-1])
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(robMaster(nums));
        System.out.println(rob(nums));
    }

    // T.C : O(n)
    // S.C : O(n)
    public static int robMaster(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0]=nums[0];
        if(n==1){
            return nums[0];
        }

        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }

        return dp[n-1];
    }

    // T.C : O(n)
    // S.C : O(1)
    public static int rob(int[] nums) {
        int currMax = 0;
        int prevMax = 0;
        for (int num : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + num, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}
