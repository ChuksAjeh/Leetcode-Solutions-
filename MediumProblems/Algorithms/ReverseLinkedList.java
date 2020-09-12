package com.company;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {
    public static void main(String[] args) {

    }


    public ListNode reverseList (ListNode head){
        //create a node called prev to hold the previous val
        if(head == null ||head.next == null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next= head;
        head.next= null;
        return p;
    }
}
