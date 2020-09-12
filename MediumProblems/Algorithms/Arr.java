package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {


        int[][] matrix = {
                {1,1},
                {3,4},
                {-1,0}
        };

        minTimeToVisitAllPoints(matrix);
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int seconds = 0;
        //base case:
        if(points == null || points.length == 0){
            return seconds;
        }

        int[] first = points[0];
        for(int i=1; i<points.length; i++){
            //next point after first
            int[] next = points[i];
            //moves in the x direction:
            int xMove = Math.abs(points[i][0] - first[0]);
            int yMove = Math.abs(points[i][1] - first[1]);
            seconds += Math.min(xMove , yMove);
            seconds += Math.abs(xMove - yMove);
            first = next;
        }

        return seconds;
    }
}


