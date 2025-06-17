class Solution {

    public boolean isHappy(int n) {
        if (n == 1 || n == -1) {
            return true;
        }
        int slow = n;
        int fast = n;
        do {
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    public int sumOfSquare(int n) {
        int output = 0;

        while (n != 0) {
            int digit = n % 10;
            digit = digit * digit;
            output += digit;
            n = n / 10;
        }

        return output;
    }
}
