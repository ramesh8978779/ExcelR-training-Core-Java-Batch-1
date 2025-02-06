import java.util.Scanner;

public class Demo047 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);

        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }

    public static int countDigits(int number) {
        int digitCount = 0;
        while (number != 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }
}

