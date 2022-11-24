package Easy;

public class Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];// first element is same as original array

        for (int i = 1; i < result.length; i++) {
            result[i] = nums[i] + result[i - 1];
        }
        return result;
    }
}
