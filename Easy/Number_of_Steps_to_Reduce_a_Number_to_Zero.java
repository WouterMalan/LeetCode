package Easy;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
            }
            else {
                num-=1;
            }
            steps++;
        }
        return steps;
    }

    //another method
    public int numberOfSteps2(int num) {
        int steps = 0;
        return helper(num, steps);
    }

    public int helper(int num, int steps){
        if(num ==0){
            return steps;
        }
        if(num % 2 ==0){
            return helper(num/2, steps+1);
        }
        else{
            return helper(num-1, steps+1);
        }
    }
}
