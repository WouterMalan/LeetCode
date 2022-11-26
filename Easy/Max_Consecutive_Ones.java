package Easy;

public class Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max= 0;
        int currentOne = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                currentOne++;
                max = Math.max(max, currentOne);
            }
            else{
                currentOne = 0;
            }
        }
        return max;
    }

    //another method
    public int findMaxConsecutiveOnes2(int[] nums) {
        int max= 0;
        int currentOne = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                currentOne++;
                
            }
            else{
                max = Math.max(max, currentOne);
                currentOne = 0;
            }
        }
        return Math.max(max, currentOne);
    }
}
