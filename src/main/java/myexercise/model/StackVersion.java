package myexercise.model;

public class StackVersion {
    private final int[] arr;
    private int top;
    private final int capacity;


    public StackVersion(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Removing: " + peek() + "\nPop element is: " + peek());
        arr[top] = 0;
        return arr[top--];
    }

    public int peek() {
        if (!isEmpty())
            return arr[top];
        else
            System.exit(1);

        return -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int elem : arr)
            System.out.println(elem);
    }
}
