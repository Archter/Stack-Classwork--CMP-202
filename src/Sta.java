import java.util.Arrays;

public class Sta {
    int size, top;
    int[] array;

    void Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size-1);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        }else {
            array[top + 1] = item;
            top++;
        }
    }

    int pop(){
        int previousTop = top;
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }else {
            top--;
            return array[previousTop];
        }
        return previousTop;
    }

    void showArray() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }else {
            for (int a = top; a >= 0; a--) {
                System.out.println(Arrays.toString(new int[]{array[a]}));

            }
        }
    }
}
