
import java.util.Scanner;

public class Demo043 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an uppercase character:");
        char upperCaseChar = scanner.next().charAt(0);

        char lowerCaseChar = Character.toLowerCase(upperCaseChar);

        System.out.println("The lowercase character is: " + lowerCaseChar);

        scanner.close();
    }
}
