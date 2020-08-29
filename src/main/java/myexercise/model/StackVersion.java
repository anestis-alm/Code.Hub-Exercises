package myexercise.model;

public class StackVersion {
    private final String[] arr;
    private int top;
    private final int capacity;


    public StackVersion(int size) {
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    public void push(String x) {
        if (isFull()) {
            System.out.println("Full Stack - Overflow");
        } else {
            System.out.println("Push -> " + x);
            arr[++top] = x;
            printStack();
        }
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack - Underflow");
            return null;
        } else {
            System.out.println("Pop -> " + peek());
            arr[top] = null;
            printStack();
            return arr[top--];
        }
    }

    public String peek() {
        if (!isEmpty())
            return arr[top];
        return null;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        System.out.print("]\n");
    }
}
