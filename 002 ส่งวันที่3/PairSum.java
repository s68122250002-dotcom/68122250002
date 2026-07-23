import java.util.Arrays;

public class PairSum {


    // ================= Brute Force =================
    static boolean findPairBruteForce(int[] a, int k) {

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] + a[j] == k) {

                    System.out.println("Pair Found : " 
                            + a[i] + " + " + a[j] + " = " + k);

                    return true;
                }

            }

        }

        return false;
    }



    // ================= Recursive Two Pointer =================
    // Array ต้องเรียงจากน้อยไปมากก่อน
    static boolean findPairRecursive(int[] a, int k, int left, int right) {


        if (left >= right)
            return false;


        int sum = a[left] + a[right];


        if (sum == k) {

            System.out.println("Pair Found : "
                    + a[left] + " + " + a[right] + " = " + k);

            return true;

        }


        if (sum < k)

            return findPairRecursive(a, k, left + 1, right);


        else

            return findPairRecursive(a, k, left, right - 1);

    }



    // ================= MAIN =================
    public static void main(String[] args) {


        int[] arr = {2, 7, 11, 15, 3, 6};

        int k = 9;


        System.out.println("Original Array : "
                + Arrays.toString(arr));


        // Brute Force
        System.out.println("\nBrute Force");

        if (!findPairBruteForce(arr, k))
            System.out.println("No Pair Found");



        // Recursive Two Pointer
        System.out.println("\nRecursive Two Pointer");

        Arrays.sort(arr);

        System.out.println("Sorted Array : "
                + Arrays.toString(arr));


        if (!findPairRecursive(arr, k, 0, arr.length - 1))
            System.out.println("No Pair Found");


    }

}