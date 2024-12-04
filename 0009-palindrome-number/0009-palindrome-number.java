class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        
        // Initialize variables to reverse the number
        int original = x;
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            x /= 10;           // Remove the last digit
            
            // Check for overflow before adding the digit
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return false; // Overflow means not a palindrome
            }
            
            reversed = reversed * 10 + digit;
        }
        
        // Compare the reversed number with the original
        return original == reversed;
    }
}
