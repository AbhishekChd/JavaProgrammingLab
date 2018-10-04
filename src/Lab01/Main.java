package Lab01;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(2);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek() + " Top of stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    }
}
