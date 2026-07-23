import java.util.Scanner;

public class ReverseString {

    public static String reverseRecursive(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }


        return s.charAt(s.length() - 1)
                + reverseRecursive(s.substring(0, s.length() - 1));
    }

    public static String reverseIterative(String s) {

        if (s == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    public static String createTestString(int size) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            sb.append('a');
        }

        return sb.toString();
    }

    public static void measureTime(String text) {

        long start, end;

        try {
            start = System.nanoTime();
            reverseRecursive(text);
            end = System.nanoTime();

            System.out.println("Recursive : " + (end - start) + " ns");

        } catch (StackOverflowError e) {

            System.out.println("Recursive : StackOverflowError");
        }

        start = System.nanoTime();
        reverseIterative(text);
        end = System.nanoTime();

        System.out.println("Iterative : " + (end - start) + " ns");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input String : ");
        String input = sc.nextLine();

        System.out.println("\nOriginal  : " + input);
        System.out.println("Recursive : " + reverseRecursive(input));
        System.out.println("Iterative : " + reverseIterative(input));

        System.out.println("\n========== Performance Test ==========");

        int[] sizes = {10, 100, 1000, 10000};

        for (int size : sizes) {

            System.out.println("\nString Length = " + size);

            String test = createTestString(size);

            measureTime(test);
        }

        sc.close();
    }
}