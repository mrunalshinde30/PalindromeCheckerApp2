import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;


public class Palindromecheckerapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare from both ends
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
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
