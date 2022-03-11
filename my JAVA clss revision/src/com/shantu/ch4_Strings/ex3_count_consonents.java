package com.shantu.ch4_Strings;

import java.util.Scanner;

public class ex3_count_consonents {
    public static void main(String[] args) {

        /*
        program for input a strings and count the consonants from it
        consonants means the characters is not an vowels from the string.

         */

        System.out.print("Enter the String : ");
        Scanner in = new Scanner(System.in);

        String str = in.nextLine(); // this is just for user input string
        str = str.toUpperCase();
        int count = 0;
        int l = 0; int d = 0; int sp = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch >= 65 && ch<= 90)
                count++;

            else if(ch >= 'a' && ch <= 'z')
                ++l ;


            else if(ch >= 48 && ch <= 57)
                d = d + 1 ;

            else sp = sp + 1 ;

        }

        System.out.println(count + " " + l + " " + d + " " + sp );
    }
}
