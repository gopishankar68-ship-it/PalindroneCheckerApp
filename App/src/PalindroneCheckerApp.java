import java.util.Deque;
import java.util.LinkedList;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "refer";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        // Compare front and rear elements
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();  // from front
            char rear = deque.removeLast();    // from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}