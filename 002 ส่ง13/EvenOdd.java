import java.util.Arrays;

public class EvenOdd {

    static void rearrangeRecursive(int[] a, int left, int right) {

        if (left >= right)
            return;

        while (left < right && a[left] % 2 == 0)
            left++;

        while (left < right && a[right] % 2 != 0)
            right--;

        if (left < right) {

            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

        }

        rearrangeRecursive(a, left, right);

    }


    static void rearrangeTwoPointer(int[] a) {

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            while (left < right && a[left] % 2 == 0)
                left++;

            while (left < right && a[right] % 2 != 0)
                right--;

            if (left < right) {

                int t = a[left];
                a[left] = a[right];
                a[right] = t;

            }

        }

    }


    static int[] rearrangeExtraArray(int[] a) {

        int[] result = new int[a.length];

        int index = 0;

        for (int x : a)
            if (x % 2 == 0)
                result[index++] = x;

        for (int x : a)
            if (x % 2 != 0)
                result[index++] = x;

        return result;

    }


    // ================= MAIN =================
    public static void main(String[] args) {

        int[] arr1 = {5, 2, 8, 7, 4, 9, 6, 3};

        System.out.println("Original : " + Arrays.toString(arr1));


        // Recursive
        int[] a1 = arr1.clone();
        rearrangeRecursive(a1, 0, a1.length - 1);
        System.out.println("Recursive : " + Arrays.toString(a1));


        // Two Pointer
        int[] a2 = arr1.clone();
        rearrangeTwoPointer(a2);
        System.out.println("Two Pointer : " + Arrays.toString(a2));


        // Extra Array
        int[] a3 = rearrangeExtraArray(arr1);
        System.out.println("Extra Array : " + Arrays.toString(a3));

    }

}