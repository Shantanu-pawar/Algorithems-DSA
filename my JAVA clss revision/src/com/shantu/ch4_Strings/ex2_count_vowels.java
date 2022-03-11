package com.shantu.ch4_Strings;

import java.util.Locale;
import java.util.Scanner;

public class ex2_count_vowels {
    public static void main(String[] args) {


        /*
        program for checking the vowels and count the vowels from string

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");

        String str = sc.nextLine();
        str = str.toUpperCase(); // convert the string into upper case
        int count = 0;

        for (int i = 0; i < str.length() ; i++) {

            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){

                count += 1;

            }
        }
        System.out.println("All vowels from the strings are : " + count );

    }
}
