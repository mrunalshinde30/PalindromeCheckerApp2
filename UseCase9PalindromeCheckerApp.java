import java.util.Scanner;

/**
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * Use Case 9: Recursive Palindrome Checker
 */

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean isPalindrome = check(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("Is Palindrome? : true");
        } else {
            System.out.println("Is Palindrome? : false");
        }

        sc.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     */
    private static boolean check(String s, int start, int end) {

        // Base case: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}
