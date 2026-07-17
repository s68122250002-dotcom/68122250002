import java.util.Scanner;

public class ReviewMethod {

    // Method หาค่ามากที่สุด
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int max = findMax(num1, num2);

        System.out.println("Maximum number = " + max);

        input.close();
    }
}