import java.util.Scanner;

public class Demo058 {
    public static void main(String[] args) {
        int number;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }

        System.out.println("Factors of " + number + ":");
        printFactors(number);
    }

    public static void printFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

