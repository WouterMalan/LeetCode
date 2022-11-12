package Easy;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Int {
    public int romanToInt(String s) {
        int ans = 0;
        int num = 0;

        for (int i = s.length(); i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if(4*num < ans){// if the next number is smaller than the current number, then minus the next number from the current number 
                ans -= num;
            }
            else{
                ans += num;
            }
        }
        return ans;
    }

    public int romanToInt2(String s) {
       Map<Character, Integer> map = new HashMap<>();
         map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

        int ans = 0;
        int num = 0;
        
        for (int i = s.length()-1; i >=0 ; i--) {// start from the end of the string
            if(map.get(s.charAt(i)) >= num){// if the next number is smaller than the current number, then minus the next number from the current number 
                ans += map.get(s.charAt(i));
            }
            else{
                ans -= map.get(s.charAt(i));
            }
            num = map.get(s.charAt(i));
        }

        return ans;
    }

    public int romanToInt3(String s) {
        int ans = 0;
        int num = 0;

        for (int i = s.length()-1; i >=0 ; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if(4* num < ans){// if the next number is smaller than the current number, then minus the next number from the current number
                ans -= num;
            }
            else{
                ans += num;
            }
        }
        return ans;
     }
}
