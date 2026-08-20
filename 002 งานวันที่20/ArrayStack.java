public class ArrayStack {
    private char[] stackArray;
    private int top;

    // Constructor to initialize stack
    public ArrayStack(int capacity) {
        stackArray = new char[capacity];
        top = -1;
    }

    // Push character onto the stack
    public void push(char value) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack is full!");
            return;
        }
        stackArray[++top] = value;
    }

    // Pop character from the stack
    public char pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return '\0';
        }
        return stackArray[top--];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Main method to test the stack
    public static void main(String[] args) {

        // Stack ตัวที่ 1 ขนาด 5
        ArrayStack stack1 = new ArrayStack(5);

        System.out.println("===== Stack 1 (Size 5) =====");

        stack1.push('A');
        stack1.push('B');
        stack1.push('C');

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());


        // Stack ตัวที่ 2 ขนาด 3
        ArrayStack stack2 = new ArrayStack(3);

        System.out.println("===== Stack 2 (Size 3) =====");

        stack2.push('X');
        stack2.push('Y');
        stack2.push('Z');

        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }
}