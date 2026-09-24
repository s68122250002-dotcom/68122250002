public class Question1 {

    public static int findZero(int[] a1, int[] a2) {

        int left = 0;
        int right = a2.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            // พบ 0
            if (a2[mid] == 0) {
                return mid;
            }

            // เปรียบเทียบ a1 และ a2
            if (mid < a1.length && a1[mid] == a2[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a1 = {1, 3, 4, 6, 7, 8, 9, 20};
        int[] a2 = {1, 3, 0, 4, 6, 7, 8, 9, 20};

        int index = findZero(a1, a2);

        System.out.println("a2 = ");

        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }

        System.out.println();

        System.out.println("ตำแหน่งของ 0 (Index) = " + index);
        System.out.println("ตำแหน่งของ 0 = " + (index + 1));
    }
}