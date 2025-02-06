package Leetcode;

class Solution {
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x; 
        int reversed = 0;

        // Reverse the number
        while (x != 0) {
            int digit = x % 10; 
            reversed = reversed * 10 + digit; 
            x /= 10; 
        }

        // Check if the original and reversed numbers are the same
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(232));  // Output: true
        System.out.println(isPalindrome(345));  // Output: false
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(0));    // Output: true
    }
}
