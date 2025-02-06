
import java.util.Scanner;

public class Demo056 {
    public static void main(String[] args) {
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }

        int sumOfCubes = sumOfCubesOfDigits(number);
        System.out.println("Sum of cubes of digits: " + sumOfCubes);
    }

    public static int sumOfCubesOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum;
    }
}
