public class CharStack {
    private int N;
    private int TOP;
    private char[] S;

    public CharStack(int size) {
        N = size;
        TOP = -1;
        S = new char[N];
    }

    public void PUSH(char x) {
        if (TOP == (N - 1)) {
            System.out.println("!!! Stack Overflow !!!");
        } else {
            TOP = TOP + 1;
            S[TOP] = x;
        }
    }

    public char POP() {
        char x = ' ';

        if (TOP < 0) {
            System.out.println("!!! Stack Underflow !!!");
        } else {
            x = S[TOP];
            TOP = TOP - 1;
        }

        return x;
    }

    public void PrintArray() {
        System.out.print("S : [");

        for (int i = 0; i <= TOP; i++) {
            System.out.print(" " + S[i]);
        }

        System.out.println(" ]");
    }

    public static void main(String[] args) {

        // Stack ตัวที่ 1 ขนาด 5
        CharStack stack1 = new CharStack(5);

        System.out.println("===== STACK 1 (Size 5) =====");

        stack1.PUSH('A');
        stack1.PUSH('B');
        stack1.PUSH('C');

        stack1.PrintArray();

        System.out.println("POP = " + stack1.POP());
        stack1.PrintArray();


        // Stack ตัวที่ 2 ขนาด 3
        CharStack stack2 = new CharStack(3);

        System.out.println("\n===== STACK 2 (Size 3) =====");

        stack2.PUSH('X');
        stack2.PUSH('Y');
        stack2.PUSH('Z');

        stack2.PrintArray();

        System.out.println("POP = " + stack2.POP());
        stack2.PrintArray();

        System.out.println("POP = " + stack2.POP());
        stack2.PrintArray();
    }
}