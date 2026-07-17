import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] score = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            score[i] = input.nextInt();
            total += score[i];
        }

        double average = (double) total / 5;

        System.out.println("Total score = " + total);
        System.out.println("Average score = " + average);

        input.close();
    }
}