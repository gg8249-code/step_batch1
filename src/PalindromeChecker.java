import java.util.Scanner;   // MUST be at the top

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {   // also fix this
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }

        scanner.close();
    }
}