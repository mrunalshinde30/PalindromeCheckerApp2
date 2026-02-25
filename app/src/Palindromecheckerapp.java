import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Palindromecheckerapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);      // FIFO
            stack.push(c);     // LIFO
        }

        boolean isPalindrome = true;

        // Compare queue front and stack top
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
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
