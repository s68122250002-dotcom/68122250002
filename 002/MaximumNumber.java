import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int n1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int n2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int n3 = input.nextInt();

        int max = n1;

        if (n2 > max)
            max = n2;

        if (n3 > max)
            max = n3;

        System.out.println("Maximum number = " + max);

        input.close();
    }
}