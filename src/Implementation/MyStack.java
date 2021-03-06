package Implementation;

import MyInterface.StackADT;

public class MyStack implements StackADT {
    private final int MAX_CAPACITY;
    int[] arr;
    int top;
    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        arr = new int[MAX_CAPACITY];
        top=0;
    }


    @Override
    public void push(int element) {
        if (top != MAX_CAPACITY){ // it denotes that stack is  not full
         arr[top]= element;
         top++;
        }
        else{
            System.out.println("Error : Stack Overflow ");
        }

    }

    @Override
    public int pop() {
        int response=0;
        if (!isempty()){
            top--;
            response=arr[top];

        }
        else{
            System.out.println("Error : Stack Underflow ");
        }
        return response;
    }

    @Override
    public boolean isempty() {

        return top==0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public int peek() {
        int response=0;
        if (!isempty()){
            response=arr[top];
        }
        else {
            System.out.println("Stack is empty ");
        }
        return response;
    }
    public  void traverse(){
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + ",");
            
        }
        System.out.println();
    }
    public boolean search(int searchElement){
        boolean response=false;
        for (int i = 0; i < top; i++) {
            if (arr[i]==searchElement){
                response=true;
                break;
            }

        }
        return response;
    }
}
