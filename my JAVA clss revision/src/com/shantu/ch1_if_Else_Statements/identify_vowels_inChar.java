package com.shantu.ch1_if_Else_Statements;

import java.util.Scanner;

public class identify_vowels_inChar {
    public static void main(String[] args) {
// que : idetify the characters is vowels or not
//        correct this problem
        Scanner in = new Scanner (System.in);
        char ch;

        System.out.println("Enter your character : ");
                ch = in.next().charAt(0) ;

                if (ch >= 'a' && ch <= 'z')
                    ch = (char)(ch + 32);
                switch (ch){
                    case'a' :
                    case'e' :
                    case'i' :
                    case'o' :
                    case'u' :

                        System.out.println("vowel"); break ;
                    default:
                        System.out.println("not vowel");
                }

    }
}
