import java.util.Scanner;

/**
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * Use Case 3: Reverse String Based Palindrome Check
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare
        if (input.equals(reversed)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        sc.close();
    }
}
