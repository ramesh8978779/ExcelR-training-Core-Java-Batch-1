import java.util.Scanner;

public class Demo036 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter third number:");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the biggest number");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the biggest number");
        } else {
            System.out.println("All numbers are equal");
        }

        scanner.close();
    }
}
