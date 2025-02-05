import java.util.Scanner;

public class Demo042 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a lowercase character:");
        char lowerCaseChar = scanner.next().charAt(0);

        char upperCaseChar = Character.toUpperCase(lowerCaseChar);

        System.out.println("The uppercase character is: " + upperCaseChar);

        scanner.close();
    }
}
