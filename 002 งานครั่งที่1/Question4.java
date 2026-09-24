public class Question4 {

    public static void main(String[] args) {

        // ข้อมูลตามโจทย์
        int[] values = {5, 28, 19, 15, 20, 33, 12, 17, 10};

        // Hash Table ขนาด 9 ช่อง
        int tableSize = 9;

        // สร้างแต่ละช่องเป็น Linked List
        Node[] table = new Node[tableSize];

        // เพิ่มข้อมูลลง Hash Table
        for (int value : values) {

            int index = value % tableSize;

            Node newNode = new Node(value);

            // ถ้ายังไม่มีข้อมูลในช่องนั้น
            if (table[index] == null) {
                table[index] = newNode;
            } else {

                // ถ้ามีข้อมูลอยู่แล้ว ให้ต่อท้าย
                Node current = table[index];

                while (current.next != null) {
                    current = current.next;
                }

                current.next = newNode;
            }
        }

        // แสดง Hash Table
        System.out.println("=== Hash Table (Chaining) ===");

        for (int i = 0; i < tableSize; i++) {

            System.out.print(i + " : ");

            Node current = table[i];

            if (current == null) {
                System.out.println("-");
            } else {

                while (current != null) {

                    System.out.print(current.data);

                    if (current.next != null) {
                        System.out.print(" -> ");
                    }

                    current = current.next;
                }

                System.out.println();
            }
        }
    }

    // Node สำหรับเก็บข้อมูลแต่ละช่อง
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}