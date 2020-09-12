package com.company;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'a','b','c'};
        reverseString(s);
    }

    public static  void reverseString(char[] s){
        char[] ans = new char[s.length];
        int count = s.length-1;
        for(int i =0; i<s.length && count >=0; i++){
            ans[count] = s[i];
            count--;
        }
        s = ans;
        System.out.println(Arrays.toString(s));
    }
}
