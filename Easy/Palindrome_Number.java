package Easy;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x <0 || (x != 0 && x % 10 == 0)){// negative number or number end with 0
            return false;
        }
        int rev = 0;
        while(x > rev){
        int lastDigit = x % 10;// get the last digit
        rev = rev *10 + lastDigit;// reverse the number
        x /=  10;// remove the last digit
        }
        return (x == rev || x == rev/10);
    }
}
