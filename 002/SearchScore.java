import java.util.Scanner;

public class SearchScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] score = new int[10];

        // รับคะแนนนักศึกษา 10 คน
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            score[i] = input.nextInt();
        }

        // รับคะแนนที่ต้องการค้นหา
        System.out.print("Enter score to search: ");
        int search = input.nextInt();

        boolean found = false;

        // ค้นหาคะแนน
        for (int i = 0; i < score.length; i++) {
            if (score[i] == search) {
                found = true;
                break;
            }
        }

        // แสดงผล
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        input.close();
    }
}