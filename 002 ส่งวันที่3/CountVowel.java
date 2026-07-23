import java.util.Scanner;

public class CountVowel {

    static int vowel;
    static int consonant;

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }

    static void countRecursive(String s, int index) {

        if (index >= s.length()) {
            return;
        }

        char c = Character.toLowerCase(s.charAt(index));

        if (Character.isLetter(c)) {
            if (isVowel(c))
                vowel++;
            else
                consonant++;
        }

        countRecursive(s, index + 1);
    }

    static boolean hasMoreVowelsRecursive(String s) {

        if (s == null)
            return false;

        vowel = 0;
        consonant = 0;

        countRecursive(s, 0);

        System.out.println("Vowels      : " + vowel);
        System.out.println("Consonants  : " + consonant);

        return vowel > consonant;
    }

    static boolean hasMoreVowelsIterative(String s) {

        if (s == null)
            return false;

        int v = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetter(ch)) {

                if (isVowel(ch))
                    v++;
                else
                    c++;
            }
        }

        System.out.println("Vowels      : " + v);
        System.out.println("Consonants  : " + c);

        return v > c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input String : ");
        String s = sc.nextLine();

        System.out.println("\n===== Recursive Counting =====");
        boolean r1 = hasMoreVowelsRecursive(s);
        System.out.println("Result : " + r1);

        System.out.println("\n===== Iterative Counting =====");
        boolean r2 = hasMoreVowelsIterative(s);
        System.out.println("Result : " + r2);

        sc.close();
    }
}