import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Sta stack = new Sta();
        stack.Stack(5);

        stack.isEmpty();

        stack.push(2);
        stack.push(3);
        stack.push(9);
        stack.push(6);
        stack.push(5);
        stack.push(3);

        stack.isFull();

        stack.pop(3);
    }
}
