public class Leetcode07 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        // if all digits are 9, add a new digit 1 at the beginning
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        Leetcode07 solution = new Leetcode07(); // Instantiate LTcode007, not Solution
        int[] digits = {9, 9, 9};  // You can change this to any array you like
        int[] result = solution.plusOne(digits);

        // Output the result
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
    