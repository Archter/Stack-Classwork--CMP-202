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

    void pop(int item){
        int previousTop = top;
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }else {
            array[top - 1] = item;
            top--;
        }
    }
}
