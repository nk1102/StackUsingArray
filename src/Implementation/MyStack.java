package Implementation;

import MyInterface.StackADT;

public class MyStack implements StackADT {
    private final int MAX_CAPACITY;
    int[] arr;
    int top;
    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        arr = new int[MAX_CAPACITY];
        top=-1;
    }


    @Override
    public void push(int element) {

    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public boolean isempty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }
}
