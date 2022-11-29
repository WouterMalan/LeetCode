package Easy;

import java.util.*;

public class Squared_of_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

       for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result.length; j++) {
            if(result[i] < result[j])
            {
                int temp = result[i];
                result[i] = result[j];
                result[j] = temp;
            }
        }
       }
        return result;
    }

    //another solution
    public int[] sortedSquares2(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);
        return result;
    }
}
