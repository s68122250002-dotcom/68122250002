import java.util.Scanner;

public class Palindrome {

    public static String cleanString(String s) {
        if (s == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(Character.toLowerCase(ch));
            }
        }

        return result.toString();
    }

    static boolean isPalindromeByReverse(String s) {

        s = cleanString(s);

        StringBuilder reverse = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }

        return s.equals(reverse.toString());
    }

    static boolean isPalindromeRecursive(String s, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input String : ");
        String input = sc.nextLine();

        String clean = cleanString(input);

        long start = System.nanoTime();
        boolean result1 = isPalindromeByReverse(input);
        long end = System.nanoTime();

        System.out.println("\n===== Reverse and Compare =====");
        System.out.println("Clean String : " + clean);
        System.out.println("Result : " + result1);
        System.out.println("Execution Time : " + (end - start) + " ns");

        start = System.nanoTime();
        boolean result2 = isPalindromeRecursive(clean, 0, clean.length() - 1);
        end = System.nanoTime();

        System.out.println("\n===== Recursive Two Pointer =====");
        System.out.println("Result : " + result2);
        System.out.println("Execution Time : " + (end - start) + " ns");

        sc.close();
    }
}