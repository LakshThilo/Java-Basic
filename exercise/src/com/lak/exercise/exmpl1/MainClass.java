package com.lak.exercise.exmpl1;

import java.lang.reflect.Array;

public class MainClass {

    public static void main(String[] args) {
     int arr[] = {2,3,3,3,5};
        System.out.println("Using normal loop-> Answer is: "+ withLoop(arr));
        System.out.println("Using normal loop-> Answer is: "+ noLoop(arr,0));
    }


    // Recursive version, requires liner space
    public static int noLoop(final int[] array, final int start){
        if(start >= array.length)
            return 0;
        else
            return array[start] + noLoop(array, start+1);
    }

    // Iterative version, require constant space
    public static int withLoop(int[] start){
        int sum = 0;
        for (int x=0; x <start.length; x++){
           sum = sum+ start[x];
        }
        return sum;
    }
}
