import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a character:");
            char character = scanner.next().charAt(0);
            
            if (character >= 'a' && character <= 'z') {
                System.out.println(character + " is a lowercase letter.");
            } else if (character >= 'A' && character <= 'Z') {
                System.out.println(character + " is an uppercase letter.");
            } else {
                System.out.println(character + " is not a letter.");
            }
        }
    }
}


