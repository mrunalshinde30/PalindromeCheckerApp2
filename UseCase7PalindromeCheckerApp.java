import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * Use Case 7: Deque Based Optimized Palindrome Checker
 */

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare from both ends
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is Palindrome? : true");
        } else {
            System.out.println("Is Palindrome? : false");
        }

        sc.close();
    }
}
