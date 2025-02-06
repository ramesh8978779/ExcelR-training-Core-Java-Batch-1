public class Leetcode03 {
    public int myAtoi(String s) {
        // Remove leading whitespace
        s = s.trim();

        // Check for sign
        int sign = 1;
        int index = 0;
        if (s.length() > 0 && (s.charAt(0) == '+' || s.charAt(0) == '-')) {
            if (s.charAt(0) == '-') {
                sign = -1;
            }
            index++;
        }

        // Initialize result
        long result = 0;

        // Read digits
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            result = result * 10 + digit;

            // Check for overflow
            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            index++;
        }

        // Return result with sign
        return (int) (sign * result);
    }
}

