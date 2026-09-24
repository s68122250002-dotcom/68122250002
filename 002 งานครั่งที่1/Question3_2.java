import java.util.Arrays;

public class Question3_2 {

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            System.out.println("Pivot = " + arr[pivotIndex]
                    + " : " + Arrays.toString(arr));

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {15, 3, 9, 31, 11, 17, 7, 23};

        System.out.println("=== Quick Sort ===");
        System.out.println("เริ่มต้น: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("ผลลัพธ์: " + Arrays.toString(arr));
    }
}