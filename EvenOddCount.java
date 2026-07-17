import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int even = 0;
        int odd = 0;

        // รับตัวเลข 10 จำนวน
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // นับเลขคู่และเลขคี่
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // แสดงผล
        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);

        input.close();
    }
}