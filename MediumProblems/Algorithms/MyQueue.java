package com.company;

import java.util.Stack;

public class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> holder = new Stack<>();
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack.size()<1){
            throw new NullPointerException();
        }
        while(stack.size()>1){
            holder.push(stack.pop());
        }
        int val = stack.pop();
        while(!holder.empty()){
            stack.push(holder.pop());
        }
        return val;
    }

    /** Get the front element. */
    public int peek() {
        if(stack.size()<1){
            throw new NullPointerException();
        }
        while(stack.size()>1){
            holder.push(stack.pop());
        }
        int val = stack.pop();

        holder.push(val);
        while(!holder.empty()){
            stack.push(holder.pop());
        }
        return val;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.size() == 0;
    }

}
