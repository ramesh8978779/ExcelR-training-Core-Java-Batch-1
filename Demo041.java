import java.util.Scanner;

public class Demo041 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char character = scanner.next().charAt(0);

        if (isVowel(character)) {
            System.out.println(character + " is a vowel.");
        } else if (isConsonant(character)) {
            System.out.println(character + " is a consonant.");
        } else {
            System.out.println(character + " is not a letter.");
        }

        scanner.close();
    }

    public static boolean isVowel(char character) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(character) != -1;
    }

    public static boolean isConsonant(char character) {
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return letters.indexOf(character) != -1 && !isVowel(character);
    }
}



