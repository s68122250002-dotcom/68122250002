public class TestCharStack {
    public static void main(String[] args) {

        CharStack stack = new CharStack(5);

        System.out.println("===== PUSH =====");

        stack.PUSH('A');
        stack.PUSH('B');
        stack.PUSH('C');

        stack.PrintArray();

        System.out.println("===== POP =====");

        System.out.println("POP = " + stack.POP());
        stack.PrintArray();

        System.out.println("POP = " + stack.POP());
        stack.PrintArray();

        System.out.println("POP = " + stack.POP());
        stack.PrintArray();
    }
}