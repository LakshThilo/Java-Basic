package com.lak.numberOfOccurrence;

import java.util.Scanner;

public class FindNumberOccurrence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String set");
        String str = scanner.nextLine();
        int initialLenght = str.length();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Character to find the occurrence");
        String ch = scanner.nextLine();

        String newStr = str.replace(ch,"");
        int finalLength = newStr.length();

        System.out.println("Total number of occurrence of characters " + str +" "+ (initialLenght - finalLength ));
    }
}
