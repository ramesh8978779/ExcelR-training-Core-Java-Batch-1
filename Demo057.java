import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }

        int sum = sumOfFirstAndLastDigits(number);
        System.out.println("Sum of first and last digits: " + sum);
    }

    public static int sumOfFirstAndLastDigits(int number) {
        int lastDigit = number % 10;
        int firstDigit = getFirstDigit(number);
        return firstDigit + lastDigit;
    }

    public static int getFirstDigit(int number) {
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }
}
