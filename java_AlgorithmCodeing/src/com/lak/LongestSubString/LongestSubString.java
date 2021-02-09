package com.lak.LongestSubString;

import java.util.HashSet;

public class LongestSubString {

    public static void main(String[] args) {

        String str = "abcdabdaabbcdefghuolpbcdecfgh";

        System.out.println("Longest sub string in the String is:  "+findLongest(str));

    }

    private static String findLongest(String str) {

        HashSet<Character> set = new HashSet<>();
        String longestOverallString = "";
        String longestTillNow = "";

        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if(set.contains(c)){
                longestTillNow = "" ;
                set.clear();
            }
            set.add(c);
            longestTillNow += c;

            if(longestTillNow.length()> longestOverallString.length()){

                longestOverallString = longestTillNow;
            }
        }
        return longestOverallString;
    }
}
