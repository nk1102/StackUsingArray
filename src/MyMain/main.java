package MyMain;

import Implementation.MyStack;


public class main {
    public static void main(String[] args) {
                int Capacity=5;
                MyStack stack=new MyStack(Capacity);
                stack.push(98);
                stack.push(67);
                stack.push(81);
                stack.push(51);
                stack.traverse();
                System.out.println("Number of elements in the stack are "+ stack.size());
                System.out.println("Element removed from the stack is " + stack.pop());
                System.out.println("searching 20 in stack found "+ stack.search(67));
            }
        }
