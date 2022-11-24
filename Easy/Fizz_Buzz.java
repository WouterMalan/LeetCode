package Easy;

import java.util.ArrayList;
import java.util.*;
public class Fizz_Buzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                result.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                result.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i + 1));// convert int to string and add to list
            }
        }
        return result;
    }

    public List<String> fizzBuzz2(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 ==0 && i % 5 == 0){
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                result.add("Fizz");
            }
            else if(i % 5 == 0){
                result.add("Buzz");
            }
            else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
