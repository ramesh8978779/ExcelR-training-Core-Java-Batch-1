import java.util.Scanner;

public class Demo055 {
    public static void main(String[] args) {
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }

        int sumOfSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
    }

    public static int sumOfSquaresOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}
