package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    /**
     * The following is the method where the solution shall be written
     */


    public static String solution(String input) throws NumberFormatException {
        //clean input
        //remove leading and trailing whitespace:

        int test = 0;
        String finalAnswer = "";
        try{
            input = cleanInput(input);
            test = Integer.parseInt(input);
            //assumed input is clean
            String permut = permutations(input,"" );
            //reverse string to put answer in correct format:
            String[] ansArr = reverse(permut);
            //append to final answer

            for(int i =0; i< ansArr.length; i++){
                finalAnswer += ansArr[i] +",";
            }
            // final clean at the end:
            finalAnswer = finalAnswer.substring(0,finalAnswer.length()-1);
        }catch (NumberFormatException e){
            System.out.println("Not a number!");
        }
        return finalAnswer;
    }

    public static void main(String args[]) {
        System.out.println(solution("326"));
        //623,632,263,236,362,326
        //solution("ABC");
        //Not a number!
    }

    public static String cleanInput (String input){
        //remove leading and trailing whitespace:
        input = input.trim();
        //remove whitespaces:
        input = input.replaceAll("\\s+","");
        //remove letters:
        input = input.replaceAll("[^\\d.]", "");
        return input;
    }

    // find all the permutations of the string.
    public static String permutations(String n,String ans){
        // Base case : String is empty
        String finalAns ="";
        if(n.length() == 0){
            return ans + " ";
        }

        for(int i=0; i< n.length(); i++) {
            //current character.
            char ch = n.charAt(i);
            //remove the ith string
            String restOfString = n.substring(0, i) + n.substring(i + 1);
            //recursive call
            finalAns += permutations(restOfString, ans + ch);
        }
        return finalAns;
    }

    public static String[] reverse (String ans){
        //split into an array
        String[] ansArr = ans.split(" ");
        // the answer is in reverse so convert to arraylist reverse and convert back
        List<String> temp = Arrays.asList(ansArr);
        Collections.reverse(temp);
        return temp.toArray(ansArr);
    }


}
