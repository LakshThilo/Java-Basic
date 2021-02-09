package com.lak.reversElementInArray;

public class ReversElementInArray {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60};

        usingLoop(arr);
    }

    private static void usingLoop(int[] arr) {
        for(int i=arr.length-1; i>=0; i--){

            System.out.println(arr[i]);
        }
    }
}
