import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();
            
            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();
            
            if (num1 > num2) {
                System.out.println(num1 + " is bigger than " + num2);
            } else if (num1 < num2) {
                System.out.println(num2 + " is bigger than " + num1);
            } else {
                System.out.println("Both numbers are equal");
            }
        }
    }
}
