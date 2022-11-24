public class Two_Sum_II {
    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[a_pointer] + numbers[b_pointer];

            if(sum > target){
                b_pointer--;
            }
            else if( sum < target){
                a_pointer ++;
            }
            else{
                return new int[]{a_pointer + 1, b_pointer + 1};
            }
        }
        return new int[]{a_pointer + 1, b_pointer + 1};
    }

    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;

        for(int i=0; i<numbers.length; i++){
            sum = numbers[a_pointer] + numbers[b_pointer];

            if(sum > target){
                b_pointer--;
            }
            else if(sum < target){
                a_pointer++;
            }
            else{
                return new int[] {a_pointer + 1, b_pointer + 1};
            }
        }
        return new int[] {a_pointer + 1, b_pointer + 1};
    }
}
