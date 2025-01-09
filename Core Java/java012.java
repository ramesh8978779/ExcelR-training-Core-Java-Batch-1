import java.util.*;

public class NextMultiple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        if (number <= 0) {
            System.out.println(-1);
        } else {
          
            int nextMultiple = ((number / 100) + 1)  * 100;
            System.out.println(nextMultiple);
        }

        sc.close();
    }
}