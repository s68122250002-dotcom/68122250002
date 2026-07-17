public class FindBallByBox {
    public static void main(String[] args) {

        int target = 56;

        if (target >= 0 && target <= 99) {
            System.out.println("ค้นหาในกล่องที่ 1");
            System.out.println("พบลูกบอลหมายเลข " + target);
        } else if (target >= 100 && target <= 199) {
            System.out.println("ค้นหาในกล่องที่ 2");
        } else if (target >= 200 && target <= 299) {
            System.out.println("ค้นหาในกล่องที่ 3");
        }
        // เพิ่มต่อไปจนถึงกล่องที่ 10
    }
}