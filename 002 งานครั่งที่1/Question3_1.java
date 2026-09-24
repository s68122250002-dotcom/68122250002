import java.util.Arrays;

public class Question3_1 {

    public static void insertionSort(int[] arr) {

        System.out.println("=== Insertion Sort ===");
        System.out.println("เริ่มต้น: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("ขั้นที่ " + i + ": "
                    + Arrays.toString(arr));
        }

        System.out.println("ผลลัพธ์: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {15, 3, 9, 31, 11, 17, 7, 23};

        insertionSort(arr);
    }
}