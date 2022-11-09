package Easy;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];// to store the result

        for (int i = 0; i < nums.length; i++) {// loop through the array to find the first number
            for (int j = i+1; j < nums.length; j++) {// loop through the array to find the second number
                if(nums[i] + nums[j] == target){// if the sum of the two numbers is equal to the target
                    result[0] = i;
                    result[1] = j;
                    return result;// return the result array
                }
            }
        }
        return result;
    }
}
