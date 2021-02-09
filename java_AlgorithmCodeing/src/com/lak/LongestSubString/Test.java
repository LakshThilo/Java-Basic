package com.lak.LongestSubString;

import java.util.HashSet;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        System.out.println(findLongestStr());

        StackImplementation.push(10);
        StackImplementation.push(4);
        StackImplementation.push(5);

        System.out.println(StackImplementation.pull());
        System.out.println(StackImplementation.peak());





    }

    private static String findLongestStr() {
        String str = "abcdaefghaijklmn";
        HashSet<Character> set = new HashSet<>();
        String longestTill = "";
        String overallLongest = "";

        for(int i=0;i<str.length();i++){

            char c = str.charAt(i);
            if(set.contains(c)){
                longestTill = "";
                set.clear();
            }

            longestTill += c;
            set.add(c);

            if(longestTill.length() > overallLongest.length()){

                overallLongest = longestTill;
            }
        }
        return overallLongest;
    }


}

class StackImplementation{

    static int  arr[] = new int[10];
    static int top = 0 ;

    public static void push(int x){

        top++;
        arr[top] = x;

    }

    public static int pull(){
        int x = arr[top];
        top--;

        return x;
    }

    public static int peak(){

        return   arr[top];
    }
}

class NumberOfOccurrences{

    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
}