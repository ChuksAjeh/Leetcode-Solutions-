package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    /** Initialize your data structure here. */
    Queue<Integer> queue = new LinkedList<Integer>();
    Queue<Integer> holder = new LinkedList<Integer>();
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        //our 'stack is then empty'
        if(queue.size()==0 || queue.size()<1){
            throw new NullPointerException();
        }
        /*while not empty lets empty the queue and populate our holder queue up to the last value*/
        while(queue.size()>1){
            //flips the position of values for our stack
            holder.add(queue.remove());
        }
        //last value in the queue: e.g  1,2,3,4 x is 4.
        int val = queue.remove();
        while(!holder.isEmpty()){
            queue.add(holder.remove());    //should be 3,2,1
        }
        //queue.add(val); //stack is now 4,3,2,1.
        return val;
    }

    /** Get the top element. */
    public int top() {
        //our 'stack is then empty'
        if(queue.size()==0 || queue.size()<1){
            throw new NullPointerException();
        }
        /*while not empty lets empty the queue and populate our holder queue up to the last value*/
        while(queue.size()>1){
            //flips the position of values for our stack
            holder.add(queue.remove());
        }
        //last value in the queue: e.g  1,2,3,4 x is 4.
        int val = queue.remove();
        while(!holder.isEmpty()){
            queue.add(holder.remove());    //should be 3,2,1
        }
        queue.add(val); //stack is now 4,3,2,1.
        return val;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        //simple size check
        return queue.isEmpty();
    }
}
