package Easy;

import java.util.*;

public class Pascal_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0) return new ArrayList<>();

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        result.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = result.get(i - 1);// get the previous row from the result
            List<Integer> current_row = new ArrayList<>();

            current_row.add(1);//first element of each row is 1 always

            for (int j = 1; j < i; j++) {
                current_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }

            current_row.add(1);//last element of each row is 1 always
            result.add(current_row);
        }
        return result;
    }


    //for Practice
    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        result.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = result.get(i - 1);
            List<Integer> current_row = new ArrayList<>();
            
            current_row.add(1);
            for (int j = 1; j < i; j++) {
                current_row.add(prev_row.get(j-1) + prev_row.get(j));
            }
            current_row.add(1);
        }
        return result;
        
    }
}
