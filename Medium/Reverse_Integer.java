public class Reverse_Integer {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int lastDigit = x % 10;// get the last digit of x
            int newReverse = reverse * 10 + lastDigit;// get the new reverse number by multiply the reverse by 10 and add the last digit
            if ((newReverse - lastDigit) / 10 != reverse) {// check if overflow happens
                return 0;// overflow happens
            }
            reverse = newReverse;// update the reverse number to the new reverse number
            x /= 10;// remove the last digit of x
        }
        return reverse;
    }
}
