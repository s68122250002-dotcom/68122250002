import java.util.Arrays;

public class Partition {

    static void partitionIterative(int[] a, int k) {

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            while (left < right && a[left] <= k)
                left++;

            while (left < right && a[right] > k)
                right--;

            if (left < right) {

                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;

                left++;
                right--;

            }

        }

    }


    public static void main(String[] args) {

        int[] arr = {9, 3, 7, 1, 8, 5, 2, 6};

        int k = 5;

        System.out.println("Before : " + Arrays.toString(arr));

        partitionIterative(arr, k);

        System.out.println("After  : " + Arrays.toString(arr));

    }

}