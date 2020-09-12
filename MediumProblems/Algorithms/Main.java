package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        MyStack myStack = new MyStack();
//        System.out.println("Is the stack empty: " + myStack.empty());
//        myStack.push(1);
//        //myStack.push(2);
//        System.out.println("Top of stack: " + myStack.top());
//        System.out.println("Value popped: " + myStack.pop());
//        System.out.println("Is the stack empty: " + myStack.empty());

        MyQueue myQueue = new MyQueue();
        System.out.println("Is the queue empty: "+myQueue.empty());
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
       System.out.println("Peeking into queue: "+ myQueue.peek());
        System.out.println("Value popped: "+myQueue.pop());
        System.out.println("Is the queue empty: "+ myQueue.empty());
    }
}
